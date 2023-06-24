package com.genericbadname.bigbrewery;

import com.genericbadname.bigbrewery.content.fluid.ModFluids;
import com.genericbadname.bigbrewery.content.item.ModItems;
import com.genericbadname.bigbrewery.data.recipe.WineMacerationRecipeGen;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.recipe.MillingRecipeGen;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Mod(BigBrewery.MOD_ID)
public class BigBrewery {
    public static final String MOD_ID = "bigbrewery";

    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    private static final Logger LOGGER = LogManager.getLogger();

    public BigBrewery() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // registry junk
        ModItems.register();
        ModFluids.register();

        REGISTRATE.registerEventListeners(eventBus);

        // mod events
        eventBus.addListener(EventPriority.LOWEST, BigBrewery::gatherData);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static void gatherData(GatherDataEvent event) {
        if (event.includeServer()) {
            DataGenerator gen = event.getGenerator();

            final List<ProcessingRecipeGen> GENERATORS = new ArrayList<>();

            // recipe generators
            GENERATORS.add(new WineMacerationRecipeGen(gen));

            gen.addProvider(true, new DataProvider() {
                @Override
                public void run(CachedOutput dc) {
                    GENERATORS.forEach(g -> {
                        try {
                            g.run(dc);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                }

                @Override
                public String getName() {
                    return "Big Brewery Processing Recipes";
                }
            });
        }
    }
}