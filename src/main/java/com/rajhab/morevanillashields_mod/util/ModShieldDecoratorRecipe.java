package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BannerPatternLayers;

public class ModShieldDecoratorRecipe extends CustomRecipe {

    public ModShieldDecoratorRecipe(CraftingBookCategory p_251065_) {
        super(p_251065_);
    }

    public boolean matches(CraftingInput p_342277_, Level p_44309_) {
        ItemStack $$2 = ItemStack.EMPTY;
        ItemStack $$3 = ItemStack.EMPTY;

        for(int $$4 = 0; $$4 < p_342277_.size(); ++$$4) {
            ItemStack $$5 = p_342277_.getItem($$4);
            if (!$$5.isEmpty()) {
                if ($$5.getItem() instanceof BannerItem) {
                    if (!$$3.isEmpty()) {
                        return false;
                    }

                    $$3 = $$5;
                } else {
                    if (
                            !($$5.is(ModItems.LEATHER_SHIELD.get())) &&
                                    !($$5.is(ModItems.GOLD_SHIELD.get())) &&
                                    !($$5.is(ModItems.DIAMOND_SHIELD.get())) &&
                                    !($$5.is(ModItems.NETHERITE_SHIELD.get())) &&
                                    !($$5.is(ModItems.EMERALD_SHIELD.get())) &&
                                    !($$5.is(ModItems.AMETHYST_SHIELD.get())) &&
                                    !($$5.is(ModItems.REDSTONE_SHIELD.get())) &&
                                    !($$5.is(ModItems.OBSIDIAN_SHIELD.get())) &&
                                    !($$5.is(ModItems.COAL_SHIELD.get())) &&
                                    !($$5.is(ModItems.END_CRYSTAL_SHIELD.get()))
                    ) {
                        return false;
                    }

                    if (!$$2.isEmpty()) {
                        return false;
                    }

                    BannerPatternLayers $$6 = (BannerPatternLayers)$$5.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
                    if (!$$6.layers().isEmpty()) {
                        return false;
                    }

                    $$2 = $$5;
                }
            }
        }

        if (!$$2.isEmpty() && !$$3.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ItemStack assemble(CraftingInput p_342063_, HolderLookup.Provider p_330479_) {
        ItemStack $$2 = ItemStack.EMPTY;
        ItemStack $$3 = ItemStack.EMPTY;

        for(int $$4 = 0; $$4 < p_342063_.size(); ++$$4) {
            ItemStack $$5 = p_342063_.getItem($$4);
            if (!$$5.isEmpty()) {
                if ($$5.getItem() instanceof BannerItem) {
                    $$2 = $$5;
                } else if (
                        ($$5.is(ModItems.LEATHER_SHIELD.get())) ||
                                ($$5.is(ModItems.GOLD_SHIELD.get())) ||
                                ($$5.is(ModItems.DIAMOND_SHIELD.get())) ||
                                ($$5.is(ModItems.NETHERITE_SHIELD.get())) ||
                                ($$5.is(ModItems.EMERALD_SHIELD.get())) ||
                                ($$5.is(ModItems.AMETHYST_SHIELD.get())) ||
                                ($$5.is(ModItems.REDSTONE_SHIELD.get())) ||
                                ($$5.is(ModItems.OBSIDIAN_SHIELD.get())) ||
                                ($$5.is(ModItems.COAL_SHIELD.get())) ||
                                ($$5.is(ModItems.END_CRYSTAL_SHIELD.get()))
                ) {
                    $$3 = $$5.copy();
                }
            }
        }

        if ($$3.isEmpty()) {
            return $$3;
        } else {
            $$3.set(DataComponents.BANNER_PATTERNS, (BannerPatternLayers)$$2.get(DataComponents.BANNER_PATTERNS));
            $$3.set(DataComponents.BASE_COLOR, ((BannerItem)$$2.getItem()).getColor());
            return $$3;
        }
    }

    @Override
    public boolean canCraftInDimensions(int p_44298_, int p_44299_) {
        return p_44298_ * p_44299_ >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializer.MOD_SHIELD_DECORATION.get();
    }
}