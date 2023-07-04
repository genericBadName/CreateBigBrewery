package com.genericbadname.bigbrewery;

import com.genericbadname.bigbrewery.content.processing.lid.LidBlock;
import com.simibubi.create.content.kinetics.BlockStressDefaults;
import com.simibubi.create.content.kinetics.press.MechanicalPressBlock;
import com.simibubi.create.content.processing.AssemblyOperatorBlockItem;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

import static com.simibubi.create.Create.REGISTRATE;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.axeOrPickaxe;

public class ModBlocks {
    public static final BlockEntry<LidBlock> LID =
            BigBrewery.REGISTRATE.block("lid", LidBlock::new)
                    .initialProperties(SharedProperties::stone)
                    .properties(p -> p.color(MaterialColor.PODZOL))
                    .properties(BlockBehaviour.Properties::noOcclusion)
                    .transform(axeOrPickaxe())
                    .blockstate(BlockStateGen.horizontalBlockProvider(true))
                    .transform(BlockStressDefaults.setImpact(8.0))
                    .item(AssemblyOperatorBlockItem::new)
                    .transform(customItemModel())
                    .lang("Mechanical Lid")
                    .register();

    public static void register() {}
}
