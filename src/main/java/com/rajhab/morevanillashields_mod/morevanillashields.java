package com.rajhab.morevanillashields_mod;

import com.mojang.logging.LogUtils;
import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.rajhab.morevanillashields_mod.item.ModCreativeModeTabs.CREATIVE_MODE_TABS;
import static com.rajhab.morevanillashields_mod.item.ModItems.ITEMS;

@Mod(morevanillashields.MOD_ID)
public class morevanillashields
{

    public static final String MOD_ID = "morevanillashields";
    private static final Logger LOGGER = LogUtils.getLogger();
    public morevanillashields()
    {
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MoreVanillaShieldsConfig.SPEC, "morevanillashields-common.toml");
        //ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MoreVanillaShieldsConfig.SPEC, "morevanillashields-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER ,ShieldConfig.SPEC, "morevanillashields-server.toml");

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info(MOD_ID + ": This mod now runs with a config file. Feel free to use it!");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

        private static ResourceLocation BLOCKING_PROPERTY_RESLOC =
                new ResourceLocation(morevanillashields.MOD_ID, "blocking");

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

            event.enqueueWork(() -> {


                ItemProperties.register(ModItems.LEATHER_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.GOLD_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.DIAMOND_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.NETHERITE_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                /*ItemProperties.register(ModItems.REDSTONE_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });*/

                ItemProperties.register(ModItems.EMERALD_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.AMETHYST_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.END_CRYSTAL_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.OBSIDIAN_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.COAL_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.TINTED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.BROWN_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.BLUE_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.CYAN_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.GREEN_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.LIME_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.YELLOW_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.PINK_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.ORANGE_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

                ItemProperties.register(ModItems.RED_STAINED_GLASS_SHIELD.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
                    return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
                });

            });

        }
    }
}
