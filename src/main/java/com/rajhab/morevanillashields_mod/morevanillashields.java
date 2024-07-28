package com.rajhab.morevanillashields_mod;

import com.mojang.logging.LogUtils;
import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.util.ModRecipeSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
//Thanks to Insane96 for some code examples

@Mod(morevanillashields.MOD_ID)
public class morevanillashields
{

    public static final String MOD_ID = "morevanillashields";
    private static final Logger LOGGER = LogUtils.getLogger();

    public morevanillashields()
    {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER ,ShieldConfig.SPEC, "morevanillashields-server.toml");
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ModItems.register(modEventBus);
        ModRecipeSerializer.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info(MOD_ID + ": This mod now runs with a config file. Feel free to use it!");
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info(MOD_ID + ": This mod is now running on a server. Please report any error or bugs.");
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
    }
}
