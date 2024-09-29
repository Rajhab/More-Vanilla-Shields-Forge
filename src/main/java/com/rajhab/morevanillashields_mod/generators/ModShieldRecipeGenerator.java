package com.rajhab.morevanillashields_mod.generators;/*package com.rajhab.morevanillashields_mod.generators;

import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.*;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModShieldRecipeGenerator extends RecipeProvider {


    public ModShieldRecipeGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LEATHER_SHIELD.get())
                .pattern("wlw")
                .pattern("www")
                .pattern(" w ")
                .define('w', ItemTags.PLANKS)
                .define('l', Items.LEATHER)
                .unlockedBy(getHasName(ModItems.LEATHER_SHIELD.get()), has(ModItems.LEATHER_SHIELD.get()))
                .save(recipeOutput);

        ConditionalRecipe.builder()
                .condition(new TagEmptyCondition(Tags.Items.TOOLS_SHIELDS))
                .recipe(output -> ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LEATHER_SHIELD.get())
                        .pattern("wlw")
                        .pattern("www")
                        .pattern(" w ")
                        .define('w', ItemTags.PLANKS)
                        .define('l', Items.LEATHER)
                        .unlockedBy(getHasName(ModItems.LEATHER_SHIELD.get()), has(ModItems.LEATHER_SHIELD.get()))
                        .save(output))
                .save(recipeOutput, ResourceLocation.parse("leather_shield_old"));
    }
}*/