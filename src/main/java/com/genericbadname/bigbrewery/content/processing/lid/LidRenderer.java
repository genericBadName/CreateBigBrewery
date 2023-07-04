package com.genericbadname.bigbrewery.content.processing.lid;

import com.genericbadname.bigbrewery.ModPartialModels;
import com.jozufozu.flywheel.backend.Backend;
import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.content.kinetics.base.KineticBlockEntityRenderer;
import com.simibubi.create.content.kinetics.press.PressingBehaviour;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.state.BlockState;

import static com.simibubi.create.content.kinetics.base.HorizontalKineticBlock.HORIZONTAL_FACING;

public class LidRenderer extends KineticBlockEntityRenderer<LidBlockEntity> {
    public static final float HEAD_OFFSET = 17f / 16f;

    public LidRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public boolean shouldRenderOffScreen(LidBlockEntity be) {
        return true;
    }

    @Override
    protected void renderSafe(LidBlockEntity be, float partialTicks, PoseStack ms, MultiBufferSource buffer, int light, int overlay) {
        super.renderSafe(be, partialTicks, ms, buffer, light, overlay);

        if (Backend.canUseInstancing(be.getLevel()))
            return;

        BlockState blockState = be.getBlockState();
        float renderedHeadOffset = be.getRenderedHeadOffset(partialTicks) * HEAD_OFFSET;

        SuperByteBuffer headRender = CachedBufferer.partialFacing(ModPartialModels.LID_HEAD, blockState, blockState.getValue(HORIZONTAL_FACING));
        headRender.translate(0, -renderedHeadOffset, 0)
                .light(light)
                .renderInto(ms, buffer.getBuffer(RenderType.solid()));
    }

    @Override
    protected BlockState getRenderedBlockState(LidBlockEntity be) {
        return shaft(getRotationAxisOf(be));
    }
}
