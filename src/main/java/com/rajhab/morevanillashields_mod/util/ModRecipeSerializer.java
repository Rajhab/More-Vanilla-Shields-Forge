package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeSerializer
{
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
        DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, morevanillashields.MOD_ID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, morevanillashields.MOD_ID);

    public static final RegistryObject<SimpleCraftingRecipeSerializer<ModShieldDecoratorRecipe>> MOD_SHIELD_DECORATION = RECIPE_SERIALIZERS.register("mod_shield_decoration", () -> new SimpleCraftingRecipeSerializer<>(ModShieldDecoratorRecipe::new));


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
}