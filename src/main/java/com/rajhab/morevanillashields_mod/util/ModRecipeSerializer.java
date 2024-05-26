package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeSerializer
{
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registry.RECIPE_TYPE_REGISTRY.location(), morevanillashields.MOD_ID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.RECIPE_SERIALIZERS, morevanillashields.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ModShieldDecoratorRecipe>> MOD_SHIELD_DECORATION =
            RECIPE_SERIALIZERS.register("mod_shield_decoration", ()-> ModShieldDecoratorRecipe.MOD_SHIELD_DECORATION);


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
}