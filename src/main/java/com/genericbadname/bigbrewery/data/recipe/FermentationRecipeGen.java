package com.genericbadname.bigbrewery.data.recipe;

import com.genericbadname.bigbrewery.BigBrewery;
import com.genericbadname.bigbrewery.ModRecipeTypes;
import com.genericbadname.bigbrewery.content.fluid.ModFluids;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;

public class FermentationRecipeGen extends ProcessingRecipeGen {
    GeneratedRecipe ELEGANT_RED = create(new ResourceLocation(BigBrewery.MOD_ID, "elegant_red_fermentation"), b -> b
            .require(ModFluids.FRUITY_RED_GRAPE_JUICE.get(), 250)
            .output(ModFluids.ELEGANT_RED_GRAPE_JUICE.get(), 250)
            .duration(100)
    );

    public FermentationRecipeGen(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected ModRecipeTypes getRecipeType() {
        return ModRecipeTypes.FERMENTATION;
    }
}
