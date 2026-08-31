package com.example.lumanations;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(LumaNations.MOD_ID)
public class LumaNations {

    public static final String MOD_ID = "lumanations";

    public static final Logger LOGGER = LogUtils.getLogger();

    public LumaNations(FMLJavaModLoadingContext context) {

        IEventBus modEventBus = context.getModEventBus();

        Luma.register(modEventBus);
        LumaCreativeTab.register(modEventBus);

        LOGGER.info("LumaNations chargé !");
    }
}
