package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

@Mod.EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, morevanillashields.MOD_ID);

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent pOutput) {

        if(pOutput.getTabKey() == CreativeModeTabs.COMBAT) {

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

            /*pOutput.accept(ModItems.LEATHER_SHIELD);
            pOutput.accept(ModItems.COAL_SHIELD);
            pOutput.accept(ModItems.GOLD_SHIELD);
            pOutput.accept(ModItems.EMERALD_SHIELD);
            pOutput.accept(ModItems.AMETHYST_SHIELD);
            pOutput.accept(ModItems.GLASS_SHIELD);
            pOutput.accept(ModItems.TINTED_GLASS_SHIELD);
            pOutput.accept(ModItems.BROWN_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.BLUE_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.CYAN_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.GREEN_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.LIME_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.YELLOW_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.PINK_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.ORANGE_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.RED_STAINED_GLASS_SHIELD);
            pOutput.accept(ModItems.DIAMOND_SHIELD);
            pOutput.accept(ModItems.OBSIDIAN_SHIELD);
            pOutput.accept(ModItems.NETHERITE_SHIELD);
            pOutput.accept(ModItems.END_CRYSTAL_SHIELD); */
        }
    }

    private static void addAfter(BuildCreativeModeTabContentsEvent event, Item after, Item itemToAdd) {
        event.getEntries().putAfter(new ItemStack(after), new ItemStack(itemToAdd), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}