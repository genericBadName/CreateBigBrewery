package com.genericbadname.bigbrewery.content.item;

import com.genericbadname.bigbrewery.BigBrewery;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ModItems {
    // grape variants
    public static final ItemEntry<Item> COLD_RED_GRAPE = BigBrewery.REGISTRATE.item("cold_red_grape", Item::new)
            .properties(p -> p.food(new FoodProperties.Builder().nutrition(2)
                    .saturationMod(0.2f)
                    .build()))
            .properties(p -> p.tab(CreativeModeTab.TAB_FOOD))
            .lang("Cold Red Grape")
            .register();

    public static final ItemEntry<Item> WARM_RED_GRAPE = BigBrewery.REGISTRATE.item("warm_red_grape", Item::new)
            .properties(p -> p.food(new FoodProperties.Builder().nutrition(2)
                    .saturationMod(0.2f)
                    .build()))
            .properties(p -> p.tab(CreativeModeTab.TAB_FOOD))
            .lang("Warm Red Grape")
            .register();

    public static final ItemEntry<Item> COLD_WHITE_GRAPE = BigBrewery.REGISTRATE.item("cold_white_grape", Item::new)
            .properties(p -> p.food(new FoodProperties.Builder().nutrition(2)
                    .saturationMod(0.2f)
                    .build()))
            .properties(p -> p.tab(CreativeModeTab.TAB_FOOD))
            .lang("Cold Red Grape")
            .register();

    public static final ItemEntry<Item> WARM_WHITE_GRAPE = BigBrewery.REGISTRATE.item("warm_white_grape", Item::new)
            .properties(p -> p.food(new FoodProperties.Builder().nutrition(2)
                    .saturationMod(0.2f)
                    .build()))
            .properties(p -> p.tab(CreativeModeTab.TAB_FOOD))
            .lang("Warm White Grape")
            .register();

    public static void register() {}
}
