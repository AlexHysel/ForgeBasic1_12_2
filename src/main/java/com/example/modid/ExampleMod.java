package com.example.modid;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class ExampleMod {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    //FMLPreInitializationEvent: fires when Forge is ready to start initializing mods,
    //you can again query annotations once again, and see where different files related to your mod would situate (e.g. config files).
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("{} preInitialization", Tags.MOD_NAME);
    }

    //FMLInitializationEvent: fires after registry events are fired, game objects largely is available in this event.
    //Hence a lot of OreDictionary activity is done here.
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LOGGER.info("{} Initialization", Tags.MOD_NAME);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LOGGER.info("{} postInitialization", Tags.MOD_NAME);
    }
}
