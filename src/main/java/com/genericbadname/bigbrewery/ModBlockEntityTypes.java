package com.genericbadname.bigbrewery;

import com.genericbadname.bigbrewery.content.processing.lid.LidBlockEntity;
import com.genericbadname.bigbrewery.content.processing.lid.LidInstance;
import com.genericbadname.bigbrewery.content.processing.lid.LidRenderer;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

import static com.simibubi.create.Create.REGISTRATE;

public class ModBlockEntityTypes {
    public static final BlockEntityEntry<LidBlockEntity> LID = REGISTRATE
            .blockEntity("lid", LidBlockEntity::new)
            .instance(() -> LidInstance::new)
            .validBlocks(ModBlocks.LID)
            .renderer(() -> LidRenderer::new)
            .register();

    public static void register() {}
}
