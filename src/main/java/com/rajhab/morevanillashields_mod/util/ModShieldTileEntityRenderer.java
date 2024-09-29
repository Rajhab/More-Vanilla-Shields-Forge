package com.rajhab.morevanillashields_mod.util;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import java.util.Objects;

@EventBusSubscriber(value = Dist.CLIENT, modid = morevanillashields.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModShieldTileEntityRenderer extends BlockEntityWithoutLevelRenderer {

    public static ModShieldTileEntityRenderer instance;

    public ModShieldTileEntityRenderer(BlockEntityRenderDispatcher p_172550_, EntityModelSet p_172551_) {
        super(p_172550_, p_172551_);
    }

    @SubscribeEvent
    public static void onRegisterReloadListener(RegisterClientReloadListenersEvent event) {
        instance = new ModShieldTileEntityRenderer(Minecraft.getInstance().getBlockEntityRenderDispatcher(),
                Minecraft.getInstance().getEntityModels());
        event.registerReloadListener(instance);
    }

    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext itemDisplayContext, PoseStack matrixStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
        BannerPatternLayers bannerpatternlayers = stack.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
        DyeColor dyecolor = stack.get(DataComponents.BASE_COLOR);
        boolean flag = !bannerpatternlayers.layers().isEmpty() || dyecolor != null;
        matrixStack.pushPose();
        matrixStack.scale(1.0F, -1.0F, -1.0F);
        Material rendermaterial = flag ? ModelBakery.SHIELD_BASE : ModelBakery.NO_PATTERN_SHIELD;

        Item shield = stack.getItem();
        if (shield == ModItems.LEATHER_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_LEATHER_SHIELD_BASE : ModModelPredicateProvider.LOCATION_LEATHER_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.GOLD_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_GOLD_SHIELD_BASE : ModModelPredicateProvider.LOCATION_GOLD_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.DIAMOND_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_DIAMOND_SHIELD_BASE : ModModelPredicateProvider.LOCATION_DIAMOND_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.NETHERITE_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_NETHERITE_SHIELD_BASE : ModModelPredicateProvider.LOCATION_NETHERITE_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.EMERALD_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_EMERALD_SHIELD_BASE : ModModelPredicateProvider.LOCATION_EMERALD_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.AMETHYST_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_AMETHYST_SHIELD_BASE : ModModelPredicateProvider.LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.REDSTONE_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_REDSTONE_SHIELD_BASE : ModModelPredicateProvider.LOCATION_REDSTONE_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.OBSIDIAN_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_OBSIDIAN_SHIELD_BASE : ModModelPredicateProvider.LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.COAL_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_COAL_SHIELD_BASE : ModModelPredicateProvider.LOCATION_COAL_SHIELD_BASE_NOPATTERN;
        } else if (shield == ModItems.END_CRYSTAL_SHIELD.get()) {
            rendermaterial = flag ? ModModelPredicateProvider.LOCATION_END_CRYSTAL_SHIELD_BASE : ModModelPredicateProvider.LOCATION_END_CRYSTAL_SHIELD_BASE_NOPATTERN;
        }
        VertexConsumer $$28 = rendermaterial.sprite().wrap(ItemRenderer.getFoilBufferDirect(buffer, this.shieldModel.renderType(rendermaterial.atlasLocation()), true, stack.hasFoil()));
        this.shieldModel.handle().render(matrixStack, $$28, combinedLight, combinedOverlay);
        if (flag) {
            BannerRenderer.renderPatterns(matrixStack, buffer, combinedLight, combinedOverlay, this.shieldModel.plate(), rendermaterial, false, (DyeColor) Objects.requireNonNullElse(dyecolor, DyeColor.WHITE), bannerpatternlayers, stack.hasFoil());
        } else {
            this.shieldModel.plate().render(matrixStack, $$28, combinedLight, combinedOverlay);
        }
        matrixStack.popPose();
    }
}