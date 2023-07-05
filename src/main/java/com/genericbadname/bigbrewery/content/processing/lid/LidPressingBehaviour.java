package com.genericbadname.bigbrewery.content.processing.lid;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllSoundEvents;
import com.simibubi.create.content.kinetics.belt.behaviour.TransportedItemStackHandlerBehaviour;
import com.simibubi.create.content.kinetics.press.PressingBehaviour;
import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.phys.AABB;
import org.apache.logging.log4j.LogManager;

public class LidPressingBehaviour extends PressingBehaviour {
    public static final int EXTENDED_CYCLE = 480; // how long 1 cycle takes (ticks)
    public static final int STAY_DOWN = 240; // amount of time the lid head stays down on the basin (ticks)
    int entityScanCooldown;
    
    public <T extends SmartBlockEntity & PressingBehaviourSpecifics> LidPressingBehaviour(T be) {
        super(be);
    }

    // modified to extend the "press down" time
    @Override
    public void tick() {
        Level level = getWorld();
        BlockPos worldPosition = getPos();

        if (!running || level == null) {
            if (level != null && !level.isClientSide) {

                if (specifics.getKineticSpeed() == 0)
                    return;
                if (entityScanCooldown > 0)
                    entityScanCooldown--;
                if (entityScanCooldown <= 0) {
                    entityScanCooldown = ENTITY_SCAN;

                    if (!AllBlocks.BASIN.has(level.getBlockState(worldPosition.below(2))))
                        return;
                }

            }
            return;
        }

        if (level.isClientSide && runningTicks == -EXTENDED_CYCLE / 2) {
            prevRunningTicks = EXTENDED_CYCLE / 2;
            return;
        }

        if (runningTicks == EXTENDED_CYCLE / 2 && specifics.getKineticSpeed() != 0) {
            if (inWorld())
                applyInWorld();
            if (onBasin())
                applyOnBasin();

            if (level.getBlockState(worldPosition.below(2))
                    .getSoundType() == SoundType.WOOL)
                AllSoundEvents.MECHANICAL_PRESS_ACTIVATION_ON_BELT.playOnServer(level, worldPosition);
            else
                AllSoundEvents.MECHANICAL_PRESS_ACTIVATION.playOnServer(level, worldPosition, .5f,
                        .75f + (Math.abs(specifics.getKineticSpeed()) / 1024f));

            if (!level.isClientSide)
                blockEntity.sendData();
        }

        if (!level.isClientSide && runningTicks > EXTENDED_CYCLE) {
            finished = true;
            running = false;
            particleItems.clear();
            specifics.onPressingCompleted();
            blockEntity.sendData();
            return;
        }

        prevRunningTicks = runningTicks;
        runningTicks += getRunningTickSpeed();
        if (prevRunningTicks < EXTENDED_CYCLE / 2 && runningTicks >= EXTENDED_CYCLE / 2) {
            runningTicks = EXTENDED_CYCLE / 2;
            // Pause the ticks until a packet is received
            if (level.isClientSide && !blockEntity.isVirtual())
                runningTicks = -(EXTENDED_CYCLE / 2);
        }
    }

    // correct head movement
    @Override
    public float getRenderedHeadOffset(float partialTicks) {
        int offsetCycle = EXTENDED_CYCLE - STAY_DOWN;

        if (!running)
            return 0;
        int runningTicks = Math.abs(this.runningTicks);
        float ticks = Mth.lerp(partialTicks, prevRunningTicks, runningTicks);
        if (runningTicks < (EXTENDED_CYCLE * 2) / 3)
            return (float) Mth.clamp(Math.pow(ticks / offsetCycle * 2, 3), 0, 1);
        return Mth.clamp((EXTENDED_CYCLE - ticks) / EXTENDED_CYCLE * 3, 0, 1);
    }
}
