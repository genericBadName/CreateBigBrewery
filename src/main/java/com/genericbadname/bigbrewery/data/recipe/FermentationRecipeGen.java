package com.genericbadname.bigbrewery.data.recipe;

import com.genericbadname.bigbrewery.BigBrewery;
import com.genericbadname.bigbrewery.ModRecipeTypes;
import com.genericbadname.bigbrewery.content.fluid.ModFluids;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.DataGenerator;

public class FermentationRecipeGen extends ProcessingRecipeGen {
    GeneratedRecipe PLEASANT_RED = create(BigBrewery.asResource("pleasant_red_fermentation"), b -> b
            .require(ModFluids.CRISP_RED_GRAPE_JUICE.get(), 250)
            .output(ModFluids.PLEASANT_RED_GRAPE_JUICE.get(), 250)
            .requiresHeat(HeatCondition.HEATED)
    );

    GeneratedRecipe BOLD_RED = create(BigBrewery.asResource("bold_red_fermentation"), b -> b
            .require(ModFluids.CRISP_RED_GRAPE_JUICE.get(), 250)
            .output(ModFluids.BOLD_RED_GRAPE_JUICE.get(), 250)
    );

    GeneratedRecipe RUSTIC_RED = create(BigBrewery.asResource("rustic_red_fermentation"), b -> b
            .require(ModFluids.FRUITY_RED_GRAPE_JUICE.get(), 250)
            .output(ModFluids.RUSTIC_RED_GRAPE_JUICE.get(), 250)
            .requiresHeat(HeatCondition.HEATED)
    );

    GeneratedRecipe ELEGANT_RED = create(BigBrewery.asResource("elegant_red_fermentation"), b -> b
            .require(ModFluids.FRUITY_RED_GRAPE_JUICE.get(), 250)
            .output(ModFluids.ELEGANT_RED_GRAPE_JUICE.get(), 250)
    );

    GeneratedRecipe PLEASANT_WHITE = create(BigBrewery.asResource("pleasant_white_fermentation"), b -> b
            .require(ModFluids.CRISP_WHITE_GRAPE_JUICE.get(), 250)
            .output(ModFluids.PLEASANT_WHITE_GRAPE_JUICE.get(), 250)
            .requiresHeat(HeatCondition.HEATED)
    );

    GeneratedRecipe BOLD_WHITE = create(BigBrewery.asResource("bold_white_fermentation"), b -> b
            .require(ModFluids.CRISP_WHITE_GRAPE_JUICE.get(), 250)
            .output(ModFluids.BOLD_WHITE_GRAPE_JUICE.get(), 250)
    );

    GeneratedRecipe RUSTIC_WHITE = create(BigBrewery.asResource("rustic_white_fermentation"), b -> b
            .require(ModFluids.FRUITY_WHITE_GRAPE_JUICE.get(), 250)
            .output(ModFluids.RUSTIC_WHITE_GRAPE_JUICE.get(), 250)
            .requiresHeat(HeatCondition.HEATED)
    );

    GeneratedRecipe ELEGANT_WHITE = create(BigBrewery.asResource("elegant_white_fermentation"), b -> b
            .require(ModFluids.FRUITY_WHITE_GRAPE_JUICE.get(), 250)
            .output(ModFluids.ELEGANT_WHITE_GRAPE_JUICE.get(), 250)
    );

    public FermentationRecipeGen(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected ModRecipeTypes getRecipeType() {
        return ModRecipeTypes.FERMENTATION;
    }
}
