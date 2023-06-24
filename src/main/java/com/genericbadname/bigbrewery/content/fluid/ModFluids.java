package com.genericbadname.bigbrewery.content.fluid;

import com.genericbadname.bigbrewery.BigBrewery;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.resources.ResourceLocation;

public class ModFluids {
    // TODO: please, for the love of god, refactor this abomination
    // possibly just make a convenience method for defining these fluids? not really much of a point in making a complex virtual wine system when the values are mutually exclusive

    // precursor wine fluids (i didn't want to overcomplicate this too much)
    public static final FluidEntry<VirtualFluid> FRUITY_RED_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("fruity_red_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/fruity_red_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/fruity_red_grape_juice_flow"))
            .lang("Fruity Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> CRISP_RED_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("crisp_red_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/crisp_red_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/crisp_red_grape_juice_flow"))
            .lang("Fruity Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> FRUITY_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("fruity_white_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/fruity_white_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/fruity_white_grape_juice_flow"))
            .lang("Fruity White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> CRISP_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("crisp_white_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/crisp_white_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/crisp_white_grape_juice_flow"))
            .lang("Crisp White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> PLEASANT_RED_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("pleasant_red_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/pleasant_red_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/pleasant_red_grape_juice_flow")) // earthy + crisp
            .lang("Pleasant Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> BOLD_RED_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("bold_red_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/bold_red_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/bold_red_grape_juice_flow")) // rich + crisp
            .lang("Bold Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> RUSTIC_RED_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("rustic_red_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/rustic_red_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/rustic_red_grape_juice_flow")) // earthy + fruity
            .lang("Rustic Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> ELEGANT_RED_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("elegant_red_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/elegant_red_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/elegant_red_grape_juice_flow")) // rich + fruity
            .lang("Elegant Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> PLEASANT_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("pleasant_white_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/pleasant_white_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/pleasant_white_grape_juice_flow")) // earthy + crisp
            .lang("Pleasant White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> BOLD_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("bold_white_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/bold_white_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/bold_white_grape_juice_flow")) // rich + crisp
            .lang("Bold White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> RUSTIC_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("rustic_white_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/rustic_white_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/rustic_white_grape_juice_flow")) // earthy + fruity
            .lang("Rustic White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> ELEGANT_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE
            .virtualFluid("elegant_white_grape_juice", new ResourceLocation(BigBrewery.MOD_ID, "fluid/elegant_white_grape_juice_still"), new ResourceLocation(BigBrewery.MOD_ID, "fluid/elegant_white_grape_juice_flow")) // rich + fruity
            .lang("Elegant White Grape Juice")
            .register();

    // wine fluids


    public static void register() {}
}
