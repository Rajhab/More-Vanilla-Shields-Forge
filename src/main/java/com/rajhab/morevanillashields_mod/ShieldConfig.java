package com.rajhab.morevanillashields_mod;

import net.minecraftforge.common.ForgeConfigSpec;

public class ShieldConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> LEATHER_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> GOLD_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> TINTED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> BROWN_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> BLUE_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> CYAN_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> GREEN_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> LIME_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> YELLOW_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> PINK_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> ORANGE_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> RED_STAINED_GLASS_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHERITE_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> AMETHYST_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> OBSIDIAN_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> COAL_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> END_CRYSTAL_SHIELD_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_TOOLTIPS;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_PARTICLES;
    public static final ForgeConfigSpec.ConfigValue<Double> REDSTONE_SHIELD_DENSITY;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_EXPLOSION;
    public static final ForgeConfigSpec.ConfigValue<Boolean> EXPLOSION_DESTROY_BLOCKS;

    static {
        BUILDER.push("Config for More Vanilla Shields!");

        BUILDER.comment("README!!!!!!!!!!!!!!!!!!!! Only change the Values before creating a world or a server! Or change the values before creating or having a Shield! If you change the values (and you already used a shield), your world should break");

        ENABLE_TOOLTIPS = BUILDER.comment("If you want tooltips to be enabled then let it on true")
                .define("enableTooltips", true);
        ENABLE_PARTICLES = BUILDER.comment("If you want particles to be enabled then let it on true")
                .define("enableParticles", true);
        ENABLE_EXPLOSION = BUILDER.comment("If you want explosions to be enabled, then put it on true")
                .define("enableExplosion", true);
        EXPLOSION_DESTROY_BLOCKS = BUILDER.comment("If you want blocks to be destroyed when the end crystal shield explodes, then put it on true")
                .define("explosionDestroyBlocks", false);
        REDSTONE_SHIELD_DENSITY = BUILDER.comment("Here you can set up the density of the redstone shield. (2500 as max bcs some of yall try to crash some games)")
                .defineInRange("redstoneShieldDensity", 0.1, 0.1, 2500);
        LEATHER_SHIELD_DURABILITY = BUILDER.comment("Durability of Leather Shield. Default Durability is 196")
                .define("leatherShieldDurability", 196);
        GOLD_SHIELD_DURABILITY = BUILDER.comment("Durability of Gold Shield. Default Durability is 322")
                .define("goldShieldDurability", 322);
        DIAMOND_SHIELD_DURABILITY = BUILDER.comment("Durability of Diamond Shield. Default Durability is 512")
                .define("diamondShieldDurability", 512);
        GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Glass Shield. Default Durability is 300")
                .define("glassShieldDurability", 300);
        TINTED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Tinted Glass Shield. Default Durability is 300")
                .define("tintedGlassShieldDurability", 300);
        BROWN_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Brown Stained Glass Shield. Default Durability is 300")
                .define("brownStainedGlassShieldDurability", 300);
        BLUE_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Blue Stained Glass Shield. Default Durability is 300")
                .define("blueStainedGlassShieldDurability", 300);
        CYAN_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Cyan Stained Glass Shield. Default Durability is 300")
                .define("cyanStainedGlassShieldDurability", 300);
        LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Light Blue Stained Glass Shield. Default Durability is 300")
                .define("lightBlueStainedGlassShieldDurability", 300);
        GREEN_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Green Stained Glass Shield. Default Durability is 300")
                .define("greenStainedGlassShieldDurability", 300);
        LIME_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Lime Stained Glass Shield. Default Durability is 300")
                .define("limeStainedGlassShieldDurability", 300);
        YELLOW_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Yellow Stained Glass Shield. Default Durability is 300")
                .define("yellowStainedGlassShieldDurability", 300);
        PINK_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Pink Stained Glass Shield. Default Durability is 300")
                .define("pinkStainedGlassShieldDurability", 300);
        ORANGE_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Orange Stained Glass Shield. Default Durability is 300")
                .define("orangeStainedGlassShieldDurability", 300);
        RED_STAINED_GLASS_SHIELD_DURABILITY = BUILDER.comment("Durability of Red Stained Glass Shield. Default Durability is 300")
                .define("redStainedGlassShieldDurability", 300);
        NETHERITE_SHIELD_DURABILITY = BUILDER.comment("Durability of Netherite Shield. Default Durability is 2042")
                .define("netheriteShieldDurability", 2042);
        EMERALD_SHIELD_DURABILITY = BUILDER.comment("Durability of Emerald Shield. Default Durability is 512")
                .define("emeraldShieldDurability", 512);
        AMETHYST_SHIELD_DURABILITY = BUILDER.comment("Durability of Amethyst Shield. Default Durability is 432")
                .define("amethystShieldDurability", 432);
        REDSTONE_SHIELD_DURABILITY = BUILDER.comment("Durability of Redstone Shield. Default Durability is 250")
                .define("redstoneShieldDurability", 250);
        OBSIDIAN_SHIELD_DURABILITY = BUILDER.comment("Durability of Obsidian Shield. Default Durability is 610")
                .define("obsidianShieldDurability", 610);
        COAL_SHIELD_DURABILITY = BUILDER.comment("Durability of Coal Shield. Default Durability is 268")
                .define("coalShieldDurability", 268);
        END_CRYSTAL_SHIELD_DURABILITY = BUILDER.comment("Durability of End Crystal Shield. Default Durability is 750")
                .define("endCrystalShieldDurability", 750);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}