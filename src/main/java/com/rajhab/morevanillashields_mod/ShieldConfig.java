package com.rajhab.morevanillashields_mod;

import net.minecraftforge.common.ForgeConfigSpec;

public class ShieldConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_TOOLTIPS;

    static {
        BUILDER.push("Config for More Vanilla Shields!");

        BUILDER.comment("README!!!!!!!!!!!!!!!!!!!! Only change the Values before creating a world or a server! Or change the values before creating or having a Shield! If you change the values (and you already used a shield), your world should break");

        ENABLE_TOOLTIPS = BUILDER.comment("If you want tooltips to be enabled then let it on true")
                .define("enableTooltips", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}