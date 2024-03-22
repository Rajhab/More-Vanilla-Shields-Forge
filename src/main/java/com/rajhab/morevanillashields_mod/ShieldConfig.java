package com.rajhab.morevanillashields_mod;


import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShieldConfig
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.Builder P = BUILDER
            .comment("README!!!!!!!!!!!!!!!!!!!! Only change the Values before creating a world or a server! Or change the values before creating or having a Shield! If you change the values (and you already used a shield), your world should break");

    public static final ForgeConfigSpec.ConfigValue<Integer> LEATHER_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Leather Shield. Default Value is 196")
            .define("leatherShieldDurability", 196);

    public static final ForgeConfigSpec.ConfigValue<Integer> GOLD_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Gold Shield. Default Value is 322")
            .define("goldShieldDurability", 322);

    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Diamond Shield. Default Value is 512")
            .define("diamondShieldDurability", 512);

    public static final ForgeConfigSpec.ConfigValue<Integer> GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Glass Shield. Default Value is 300")
            .define("glassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> TINTED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Tinted Glass Shield. Default Value is 300")
            .define("tintedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> BROWN_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Brown Stained Glass Shield. Default Value is 300")
            .define("brownStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> BLUE_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Blue Stained Glass Shield. Default Value is 300")
            .define("blueStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> CYAN_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Cyan Stained Glass Shield. Default Value is 300")
            .define("cyanStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Light Blue Stained Glass Shield. Default Value is 300")
            .define("lightBlueStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> GREEN_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Green Stained Glass Shield. Default Value is 300")
            .define("greenStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> LIME_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Lime Stained Glass Shield. Default Value is 300")
            .define("limeStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> YELLOW_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Yellow Stained Glass Shield. Default Value is 300")
            .define("yellowStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> PINK_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Pink Stained Glass Shield. Default Value is 300")
            .define("pinkStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> ORANGE_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Orange Stained Glass Shield. Default Value is 300")
            .define("orangeStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> RED_STAINED_GLASS_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Red Stained Glass Shield. Default Value is 300")
            .define("redStainedGlassShieldDurability", 300);

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHERITE_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Netherite Shield. Default Value is 2042")
            .define("netheriteShieldDurability", 2042);

    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Emerald Shield. Default Value is 512")
            .define("emeraldShieldDurability", 512);

    public static final ForgeConfigSpec.ConfigValue<Integer> AMETHYST_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Amethyst Shield. Default Value is 432")
            .define("amethystShieldDurability", 432);

    public static final ForgeConfigSpec.ConfigValue<Integer> OBSIDIAN_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Obsidian Shield. Default Value is 610")
            .define("obsidianShieldDurability", 610);

    public static final ForgeConfigSpec.ConfigValue<Integer> COAL_SHIELD_DURABILITY = BUILDER
            .comment("Durability of Coal Shield. Default Value is 268")
            .define("coalShieldDurability", 268);

    public static final ForgeConfigSpec.ConfigValue<Integer> END_CRYSTAL_SHIELD_DURABILITY = BUILDER
            .comment("Durability of End Crystal Shield. Default Value is 750")
            .define("endCrystalShieldDurability", 750);


    static final ForgeConfigSpec SPEC = BUILDER.build();

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
    }
}