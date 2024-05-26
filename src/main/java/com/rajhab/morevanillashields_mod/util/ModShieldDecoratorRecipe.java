package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.jetbrains.annotations.NotNull;

;

public class ModShieldDecoratorRecipe extends CustomRecipe {

    public ModShieldDecoratorRecipe(CraftingBookCategory category) {
        super(category);
    }

    public boolean matches(CraftingContainer craftingContainer, @NotNull Level level) {
        ItemStack shieldStack = ItemStack.EMPTY;
        ItemStack bannerStack = ItemStack.EMPTY;

        for(int i = 0; i < craftingContainer.getContainerSize(); ++i) {
            ItemStack itemStack = craftingContainer.getItem(i);
            if (!itemStack.isEmpty()) {
                if (itemStack.getItem() instanceof BannerItem) {
                    if (!bannerStack.isEmpty()) {
                        return false;
                    }

                    bannerStack = itemStack;
                }
                else {
                    if (!(itemStack.is(ModItems.LEATHER_SHIELD.get())) &&
                            !(itemStack.is(ModItems.GOLD_SHIELD.get())) &&
                            !(itemStack.is(ModItems.DIAMOND_SHIELD.get())) &&
                            !(itemStack.is(ModItems.NETHERITE_SHIELD.get())) &&
                            !(itemStack.is(ModItems.EMERALD_SHIELD.get())) &&
                            !(itemStack.is(ModItems.AMETHYST_SHIELD.get())) &&
                            !(itemStack.is(ModItems.OBSIDIAN_SHIELD.get())) &&
                            !(itemStack.is(ModItems.COAL_SHIELD.get())) &&
                            !(itemStack.is(ModItems.END_CRYSTAL_SHIELD.get()))
                            || !shieldStack.isEmpty()
                            || BlockItem.getBlockEntityData(itemStack) != null
                    ) {
                        return false;
                    }

                    shieldStack = itemStack;
                }
            }
        }

        return !shieldStack.isEmpty() && !bannerStack.isEmpty();
    }

    @Override
    public @NotNull ItemStack assemble(CraftingContainer craftingContainer, RegistryAccess registryAccess) {
        ItemStack bannerStack = ItemStack.EMPTY;
        ItemStack shieldStack = ItemStack.EMPTY;

        for(int i = 0; i < craftingContainer.getContainerSize(); ++i) {
            ItemStack itemStack = craftingContainer.getItem(i);
            if (!itemStack.isEmpty()) {
                if (itemStack.getItem() instanceof BannerItem) {
                    bannerStack = itemStack;
                }
                else if ((itemStack
                        .is(ModItems.LEATHER_SHIELD.get())) ||
                        (itemStack.is(ModItems.GOLD_SHIELD.get())) ||
                        (itemStack.is(ModItems.DIAMOND_SHIELD.get())) ||
                        (itemStack.is(ModItems.NETHERITE_SHIELD.get())) ||
                        (itemStack.is(ModItems.EMERALD_SHIELD.get())) ||
                        (itemStack.is(ModItems.AMETHYST_SHIELD.get())) ||
                        (itemStack.is(ModItems.OBSIDIAN_SHIELD.get())) ||
                        (itemStack.is(ModItems.COAL_SHIELD.get())) ||
                        (itemStack.is(ModItems.END_CRYSTAL_SHIELD.get()))
                ) {
                    shieldStack = itemStack.copy();
                }
            }
        }

        if (!shieldStack.isEmpty()) {
            CompoundTag bannerTag = BlockItem.getBlockEntityData(bannerStack);
            CompoundTag shieldTag = bannerTag == null ? new CompoundTag() : bannerTag.copy();
            shieldTag.putInt("Base", ((BannerItem) bannerStack.getItem()).getColor().getId());
            BlockItem.setBlockEntityData(shieldStack, BlockEntityType.BANNER, shieldTag);
        }
        return shieldStack;
    }

    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    public @NotNull RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializer.MOD_SHIELD_DECORATION.get();
    }
}