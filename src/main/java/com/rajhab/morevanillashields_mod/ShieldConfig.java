package com.rajhab.morevanillashields_mod;

import net.minecraftforge.common.ForgeConfigSpec;

public class ShieldConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_TOOLTIPS;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_PARTICLES;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SHIELD_DENSITY;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_EXPLOSION;
    public static final ForgeConfigSpec.ConfigValue<Boolean> EXPLOSION_DESTROY_BLOCKS;

    static {
        BUILDER.push("Config for More Vanilla Shields!");

        BUILDER.comment("README!!!!!!!!!!!!!!!!!!!! Only change the Values before creating a world or a server! Or change the values before creating or having a Shield! If you change the values (and you already used a shield), your world should break");

        ENABLE_TOOLTIPS = BUILDER.comment("If you want tooltips to be enabled then let it on true")
                .define("enableTooltips", true);
        ENABLE_EXPLOSION = BUILDER.comment("If you want explosions to be enabled, then put it on true")
                .define("enableExplosion", false);
        EXPLOSION_DESTROY_BLOCKS = BUILDER.comment("If you want blocks to be destroyed when the end crystal shield explodes, then put it on true")
                .define("explosionDestroyBlocks", false);
        ENABLE_PARTICLES = BUILDER.comment("If you want particles to be enabled then let it on true")
                .define("enableParticles", true);
        REDSTONE_SHIELD_DENSITY = BUILDER.comment("Here you can set up the density of the redstone shield. (2500 as max bcs some of yall try to crash some games)")
                .defineInRange("redstoneShieldDensity", 1, 1, 2500);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}