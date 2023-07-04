package com.genericbadname.bigbrewery;

import com.jozufozu.flywheel.core.PartialModel;
import net.minecraft.resources.ResourceLocation;

public class ModPartialModels {
    public static final PartialModel LID_HEAD = block("lid/head");

    private static PartialModel block(String path) {
        return new PartialModel(new ResourceLocation(BigBrewery.MOD_ID, "block/" + path));
    }

    private static PartialModel entity(String path) {
        return new PartialModel(new ResourceLocation(BigBrewery.MOD_ID, "entity/" + path));
    }

    public static void init() {
        // init static fields
    }
}
