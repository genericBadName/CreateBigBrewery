package com.genericbadname.bigbrewery.data.recipe;

import com.genericbadname.bigbrewery.ModRecipeTypes;
import com.simibubi.create.content.processing.basin.BasinRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;

public class FermentationRecipe extends BasinRecipe {
    public FermentationRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(ModRecipeTypes.FERMENTATION, params);
    }
}
