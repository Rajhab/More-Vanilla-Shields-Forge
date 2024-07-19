package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.ShieldConfig;
import com.rajhab.morevanillashields_mod.morevanillashields;
import com.rajhab.morevanillashields_mod.util.ModShieldTileEntityRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ModItems extends Item.Properties {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, morevanillashields.MOD_ID);

    public ModItems defaultDurability(int pDefaultDamage) {
        return this.component() == 0 ? this.durability(pDefaultDamage) : this;
    }

    private int component() {
        return 0;
    }

    public ModItems durability(int pMaxDamage) {
        this.component(DataComponents.MAX_DAMAGE, pMaxDamage);
        this.component(DataComponents.MAX_STACK_SIZE, 1);
        this.component(DataComponents.DAMAGE, 0);
        return this;
    }

    //Shield
    public static final RegistryObject<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new ModItems().defaultDurability(196)){

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

    public static final RegistryObject<Item> REDSTONE_SHIELD = ITEMS.register("redstone_shield",
            () -> new ShieldItem(new ModItems().defaultDurability(250)) {

                @Override
                public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
                    if(ShieldConfig.ENABLE_PARTICLES.get()) {

                        float pAlpha = 1;
                        float yaw = -pLivingEntity.getYRot();
                        float pitch = -pLivingEntity.getXRot();

                        double offsetX = 0.5 * Math.sin(Math.toRadians(yaw));
                        double offsetY = 0.5 * Math.sin(Math.toRadians(pitch));
                        double offsetZ = 0.5 * Math.cos(Math.toRadians(yaw));

                        Vector3d offsetVector = new Vector3d(0.0, 0.0, 0.0);

                        offsetVector.rotateX(-pitch * Math.PI / 180.0);
                        offsetVector.rotateZ(-yaw * Math.PI / 180.0);

                        offsetX += offsetVector.x;
                        offsetY += offsetVector.y;
                        offsetZ += offsetVector.z;

                        Random rand = new Random();

                        for (double countparticles = 0; countparticles <= ShieldConfig.REDSTONE_SHIELD_DENSITY.get(); ++countparticles) {
                            pLevel.addParticle(new DustParticleOptions(DustParticleOptions.REDSTONE_PARTICLE_COLOR, pAlpha),
                                    (pLivingEntity.position().x + offsetX) + (rand.nextDouble() - 0.5D),
                                    (pLivingEntity.position().y + offsetY) + (rand.nextDouble() + 0.5D),
                                    (pLivingEntity.position().z + offsetZ) + (rand.nextDouble() - 0.5D),
                                    0.0, 0.0, 0.0);
                        }
                    }
                }

                @Override
                public void appendHoverText(ItemStack stack, TooltipContext level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if(ShieldConfig.ENABLE_PARTICLES.get()) {
                            if (Screen.hasShiftDown()) {
                                components.add(Component.translatable("item.moditems.redstone_shield").append("250").append(Component.translatable("item.moditems.redstone_shield.particles_enabled")).withStyle(ChatFormatting.DARK_AQUA));
                            } else {
                                components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                            }

                            super.appendHoverText(stack, level, components, flag);
                        }
                        else {
                            if (Screen.hasShiftDown()) {
                                components.add(Component.translatable("item.moditems.redstone_shield").append("250").append(Component.translatable("item.moditems.redstone_shield.particles_disabled")).withStyle(ChatFormatting.DARK_AQUA));
                            } else {
                                components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                            }

                            super.appendHoverText(stack, level, components, flag);
                        }
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
