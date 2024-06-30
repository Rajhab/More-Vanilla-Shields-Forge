package com.rajhab.morevanillashields_mod.util;


import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.jetbrains.annotations.ApiStatus;

import java.util.Set;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModelPredicateProvider {

    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            addShieldPropertyOverrides(ResourceLocation.fromNamespaceAndPath(morevanillashields.MOD_ID, "blocking"),
                    (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F,
                    //Shields with Banner Support
                    ModItems.LEATHER_SHIELD.get(),
                    ModItems.GOLD_SHIELD.get(),
                    ModItems.DIAMOND_SHIELD.get(),
                    ModItems.NETHERITE_SHIELD.get(),
                    ModItems.EMERALD_SHIELD.get(),
                    ModItems.AMETHYST_SHIELD.get(),
                    ModItems.OBSIDIAN_SHIELD.get(),
                    ModItems.COAL_SHIELD.get(),
                    ModItems.END_CRYSTAL_SHIELD.get(),
                    //Shields without Banner Support
                    ModItems.GLASS_SHIELD.get(),
                    ModItems.TINTED_GLASS_SHIELD.get(),
                    ModItems.BROWN_STAINED_GLASS_SHIELD.get(),
                    ModItems.BLUE_STAINED_GLASS_SHIELD.get(),
                    ModItems.CYAN_STAINED_GLASS_SHIELD.get(),
                    ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD.get(),
                    ModItems.GREEN_STAINED_GLASS_SHIELD.get(),
                    ModItems.LIME_STAINED_GLASS_SHIELD.get(),
                    ModItems.YELLOW_STAINED_GLASS_SHIELD.get(),
                    ModItems.PINK_STAINED_GLASS_SHIELD.get(),
                    ModItems.ORANGE_STAINED_GLASS_SHIELD.get(),
                    ModItems.RED_STAINED_GLASS_SHIELD.get()
            );
        });
    }

    private static void addShieldPropertyOverrides(ResourceLocation override, ClampedItemPropertyFunction propertyGetter,
                                                   ItemLike... shields) {
        for (ItemLike shield : shields) {
            ItemProperties.register(shield.asItem(), override, propertyGetter);
        }
    }

    @SuppressWarnings("deprecation")
    @SubscribeEvent
    public static void onStitch(Pre event) {
        if (event.getAtlas().location().equals(TextureAtlas.LOCATION_BLOCKS)) {
            for (Material textures : new Material[] {
                    LOCATION_LEATHER_SHIELD_BASE,
                    LOCATION_LEATHER_SHIELD_BASE_NOPATTERN,
                    LOCATION_GOLD_SHIELD_BASE,
                    LOCATION_GOLD_SHIELD_BASE_NOPATTERN,
                    LOCATION_DIAMOND_SHIELD_BASE,
                    LOCATION_DIAMOND_SHIELD_BASE_NOPATTERN,
                    LOCATION_NETHERITE_SHIELD_BASE,
                    LOCATION_NETHERITE_SHIELD_BASE_NOPATTERN,
                    LOCATION_EMERALD_SHIELD_BASE,
                    LOCATION_EMERALD_SHIELD_BASE_NOPATTERN,
                    LOCATION_AMETHYST_SHIELD_BASE,
                    LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN,
                    LOCATION_OBSIDIAN_SHIELD_BASE,
                    LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN,
                    LOCATION_COAL_SHIELD_BASE,
                    LOCATION_COAL_SHIELD_BASE_NOPATTERN,
                    LOCATION_END_CRYSTAL_SHIELD_BASE,
                    LOCATION_END_CRYSTAL_SHIELD_BASE_NOPATTERN,
            }) {
                event.addSprite(textures.texture());
            }
        }
    }

    public static class Pre extends TextureStitchEvent {
        private final Set<ResourceLocation> sprites;

        @ApiStatus.Internal
        public Pre(TextureAtlas map, Set<ResourceLocation> sprites) {
            super(map);
            this.sprites = sprites;
        }

        public boolean addSprite(ResourceLocation sprite) {
            return this.sprites.add(sprite);
        }
    }

    public static final Material LOCATION_LEATHER_SHIELD_BASE = material("entity/leather_shield_base");
    public static final Material LOCATION_LEATHER_SHIELD_BASE_NOPATTERN = material("entity/leather_shield_base_nopattern");
    public static final Material LOCATION_GOLD_SHIELD_BASE = material("entity/gold_shield_base");
    public static final Material LOCATION_GOLD_SHIELD_BASE_NOPATTERN = material("entity/gold_shield_base_nopattern");
    public static final Material LOCATION_DIAMOND_SHIELD_BASE = material("entity/diamond_shield_base");
    public static final Material LOCATION_DIAMOND_SHIELD_BASE_NOPATTERN = material("entity/diamond_shield_base_nopattern");
    public static final Material LOCATION_NETHERITE_SHIELD_BASE = material("entity/netherite_shield_base");
    public static final Material LOCATION_NETHERITE_SHIELD_BASE_NOPATTERN = material("entity/netherite_shield_base_nopattern");
    public static final Material LOCATION_EMERALD_SHIELD_BASE = material("entity/emerald_shield_base");
    public static final Material LOCATION_EMERALD_SHIELD_BASE_NOPATTERN = material("entity/emerald_shield_base_nopattern");
    public static final Material LOCATION_AMETHYST_SHIELD_BASE = material("entity/amethyst_shield_base");
    public static final Material LOCATION_AMETHYST_SHIELD_BASE_NOPATTERN = material("entity/amethyst_shield_base_nopattern");
    public static final Material LOCATION_OBSIDIAN_SHIELD_BASE = material("entity/obsidian_shield_base");
    public static final Material LOCATION_OBSIDIAN_SHIELD_BASE_NOPATTERN = material("entity/obsidian_shield_base_nopattern");
    public static final Material LOCATION_COAL_SHIELD_BASE = material("entity/coal_shield_base");
    public static final Material LOCATION_COAL_SHIELD_BASE_NOPATTERN = material("entity/coal_shield_base_nopattern");
    public static final Material LOCATION_END_CRYSTAL_SHIELD_BASE = material("entity/end_crystal_shield_base");
    public static final Material LOCATION_END_CRYSTAL_SHIELD_BASE_NOPATTERN = material("entity/end_crystal_shield_base_nopattern");

    @SuppressWarnings("deprecation")
    private static Material material(String path) {
        return new Material(
                TextureAtlas.LOCATION_BLOCKS, ResourceLocation.fromNamespaceAndPath(morevanillashields.MOD_ID, path));
    }

}
