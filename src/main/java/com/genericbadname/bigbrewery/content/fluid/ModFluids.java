package com.genericbadname.bigbrewery.content.fluid;

import com.genericbadname.bigbrewery.BigBrewery;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.tterrag.registrate.util.entry.FluidEntry;

public class ModFluids {
    // TODO: please, for the love of god, refactor this abomination

    // precursor wine fluids (i didn't want to overcomplicate this too much)
    public static final FluidEntry<VirtualFluid> FRUITY_RED_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("fruity_red_grape_juice")
            .lang("Fruity Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> CRISP_RED_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("crisp_red_grape_juice")
            .lang("Fruity Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> FRUITY_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("fruity_white_grape_juice")
            .lang("Fruity White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> CRISP_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("crisp_white_grape_juice")
            .lang("Crisp White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> PLEASANT_RED_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("pleasant_red_grape_juice") // earthy + crisp
            .lang("Pleasant Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> BOLD_RED_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("bold_red_grape_juice") // rich + crisp
            .lang("Bold Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> RUSTIC_RED_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("rustic_red_grape_juice") // earthy + fruity
            .lang("Rustic Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> ELEGANT_RED_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("elegant_red_grape_juice") // rich + fruity
            .lang("Elegant Red Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> PLEASANT_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("pleasant_white_grape_juice") // earthy + crisp
            .lang("Pleasant White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> BOLD_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("bold_white_grape_juice") // rich + crisp
            .lang("Bold White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> RUSTIC_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("rustic_white_grape_juice") // earthy + fruity
            .lang("Rustic White Grape Juice")
            .register();

    public static final FluidEntry<VirtualFluid> ELEGANT_WHITE_GRAPE_JUICE = BigBrewery.REGISTRATE.virtualFluid("elegant_white_grape_juice") // rich + fruity
            .lang("Elegant White Grape Juice")
            .register();

    // wine fluids

    public static void register() {}
}
