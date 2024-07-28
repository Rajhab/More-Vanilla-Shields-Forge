package com.rajhab.morevanillashields_mod;

import com.mojang.logging.LogUtils;
import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.util.ModRecipeSerializer;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
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
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info(MOD_ID + ": This mod now runs with a config file. Feel free to use it!");
    }

    private void addCreative(CreativeModeTabEvent.BuildContents pOutput) {

        if(pOutput.getTab() == CreativeModeTabs.COMBAT) {

            addAfter(pOutput, Items.SHIELD, ModItems.LEATHER_SHIELD.get());
            addAfter(pOutput, ModItems.LEATHER_SHIELD.get(), ModItems.GOLD_SHIELD.get());
            addAfter(pOutput, ModItems.GOLD_SHIELD.get(), ModItems.DIAMOND_SHIELD.get());
            addAfter(pOutput, ModItems.DIAMOND_SHIELD.get(), ModItems.NETHERITE_SHIELD.get());
            addAfter(pOutput, ModItems.NETHERITE_SHIELD.get(), ModItems.EMERALD_SHIELD.get());
            addAfter(pOutput, ModItems.EMERALD_SHIELD.get(), ModItems.AMETHYST_SHIELD.get());
            addAfter(pOutput, ModItems.AMETHYST_SHIELD.get(), ModItems.OBSIDIAN_SHIELD.get());
            addAfter(pOutput, ModItems.OBSIDIAN_SHIELD.get(), ModItems.COAL_SHIELD.get());
            addAfter(pOutput, ModItems.COAL_SHIELD.get(), ModItems.END_CRYSTAL_SHIELD.get());
            addAfter(pOutput, ModItems.END_CRYSTAL_SHIELD.get(), ModItems.GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.GLASS_SHIELD.get(), ModItems.TINTED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.TINTED_GLASS_SHIELD.get(), ModItems.BROWN_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.BROWN_STAINED_GLASS_SHIELD.get(), ModItems.BLUE_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.BLUE_STAINED_GLASS_SHIELD.get(), ModItems.CYAN_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.CYAN_STAINED_GLASS_SHIELD.get(), ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD.get(), ModItems.GREEN_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.GREEN_STAINED_GLASS_SHIELD.get(), ModItems.YELLOW_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.YELLOW_STAINED_GLASS_SHIELD.get(), ModItems.PINK_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.PINK_STAINED_GLASS_SHIELD.get(), ModItems.ORANGE_STAINED_GLASS_SHIELD.get());
            addAfter(pOutput, ModItems.ORANGE_STAINED_GLASS_SHIELD.get(), ModItems.RED_STAINED_GLASS_SHIELD.get());

        }
    }

    private static void addAfter(CreativeModeTabEvent.BuildContents pOutput, Item after, Item itemToAdd) {
        pOutput.getEntries().putAfter(new ItemStack(after), new ItemStack(itemToAdd), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
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
