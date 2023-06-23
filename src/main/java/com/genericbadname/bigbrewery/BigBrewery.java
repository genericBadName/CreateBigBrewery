package com.genericbadname.bigbrewery;

import com.genericbadname.bigbrewery.content.fluid.ModFluids;
import com.genericbadname.bigbrewery.content.item.ModItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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



        MinecraftForge.EVENT_BUS.register(this);


    }
}