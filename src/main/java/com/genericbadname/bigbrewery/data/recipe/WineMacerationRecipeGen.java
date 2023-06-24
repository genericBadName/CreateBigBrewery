package com.genericbadname.bigbrewery.data.recipe;

import com.genericbadname.bigbrewery.BigBrewery;
import com.genericbadname.bigbrewery.content.fluid.ModFluids;
import com.genericbadname.bigbrewery.content.item.ModItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;

public class WineMacerationRecipeGen extends ProcessingRecipeGen {
    // grape maceration
    GeneratedRecipe FRUITY_RED_MACERATION = create(new ResourceLocation(BigBrewery.MOD_ID, "fruity_red_maceration"), b -> b.require(ModItems.WARM_RED_GRAPE.get()).output(ModFluids.FRUITY_RED_GRAPE_JUICE.get(), 125));
    GeneratedRecipe CRISP_RED_MACERATION = create(new ResourceLocation(BigBrewery.MOD_ID, "crisp_red_maceration"), b -> b.require(ModItems.COLD_RED_GRAPE.get()).output(ModFluids.CRISP_RED_GRAPE_JUICE.get(), 125));
    GeneratedRecipe FRUITY_WHITE_MACERATION = create(new ResourceLocation(BigBrewery.MOD_ID, "fruity_white_maceration"), b -> b.require(ModItems.WARM_WHITE_GRAPE.get()).output(ModFluids.FRUITY_WHITE_GRAPE_JUICE.get(), 125));
    GeneratedRecipe CRISP_WHITE_MACERATION = create(new ResourceLocation(BigBrewery.MOD_ID, "crisp_white_maceration"), b -> b.require(ModItems.COLD_WHITE_GRAPE.get()).output(ModFluids.CRISP_WHITE_GRAPE_JUICE.get(), 125));

    public WineMacerationRecipeGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.MIXING;
    }
}
