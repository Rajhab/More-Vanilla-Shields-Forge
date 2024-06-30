package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.ShieldConfig;
import com.rajhab.morevanillashields_mod.morevanillashields;
import com.rajhab.morevanillashields_mod.util.ModShieldTileEntityRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModItems{

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, morevanillashields.MOD_ID);

    //Shield
    public static final RegistryObject<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new Item.Properties().durability(196)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if(ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.leather_shield").append("196").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });



    public static final RegistryObject<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().durability(322)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.gold_shield").append("322").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().durability(512)) {

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.diamond_shield").append("512").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> GLASS_SHIELD = ITEMS.register("glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> TINTED_GLASS_SHIELD = ITEMS.register("tinted_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.tinted_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> BROWN_STAINED_GLASS_SHIELD = ITEMS.register("brown_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.brown_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> BLUE_STAINED_GLASS_SHIELD = ITEMS.register("blue_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.blue_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> CYAN_STAINED_GLASS_SHIELD = ITEMS.register("cyan_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.cyan_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_GLASS_SHIELD = ITEMS.register("light_blue_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.light_blue_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> GREEN_STAINED_GLASS_SHIELD = ITEMS.register("green_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.green_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> LIME_STAINED_GLASS_SHIELD = ITEMS.register("lime_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.lime_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> YELLOW_STAINED_GLASS_SHIELD = ITEMS.register("yellow_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.yellow_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> PINK_STAINED_GLASS_SHIELD = ITEMS.register("pink_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.pink_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> ORANGE_STAINED_GLASS_SHIELD = ITEMS.register("orange_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.orange_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> RED_STAINED_GLASS_SHIELD = ITEMS.register("red_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().durability(300)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.red_stained_glass_shield").append("300").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final RegistryObject<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().durability(2042).fireResistant()){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.netherite_shield").append("2042").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().durability(512)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.emerald_shield").append("512").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().durability(432)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.amethyst_shield").append("432").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().durability(610)){

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.obsidian_shield").append("610").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> COAL_SHIELD = ITEMS.register("coal_shield",
            () -> new ShieldItem(new Item.Properties().durability(268)) {

                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 2400;
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.coal_shield").append("268").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield",
            () -> new ShieldItem(new Item.Properties().durability(750)) {

                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.end_crystal_shield").append("750").withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }

            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
