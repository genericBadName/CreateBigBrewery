package com.genericbadname.bigbrewery;

import com.simibubi.create.foundation.render.SuperByteBufferCache;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class BigBreweryClient {
    public static final SuperByteBufferCache BUFFER_CACHE = new SuperByteBufferCache();

    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(BigBreweryClient::clientInit);
    }

    public static void clientInit(final FMLClientSetupEvent event) {
        ModPartialModels.init();
    }
}
