package com.rajhab.morevanillashields_mod.item;/*package com.rajhab.morevanillashields_mod.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {

    public static void addCustomItemProperties() {

        ItemProperties.register(ModItems.LEATHER_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.GOLD_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.DIAMOND_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.NETHERITE_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.EMERALD_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.AMETHYST_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.END_CRYSTAL_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.OBSIDIAN_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.COAL_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.TINTED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.BROWN_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.BLUE_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.CYAN_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.GREEN_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.LIME_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.YELLOW_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.PINK_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.ORANGE_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        ItemProperties.register(ModItems.RED_STAINED_GLASS_SHIELD.get(), new ResourceLocation("morevanillashields:blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

    }
}
*/