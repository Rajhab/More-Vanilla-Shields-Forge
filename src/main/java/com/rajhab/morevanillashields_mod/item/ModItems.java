package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.ShieldConfig;
import com.rajhab.morevanillashields_mod.math.ModVector3d;
import com.rajhab.morevanillashields_mod.morevanillashields;
import com.rajhab.morevanillashields_mod.util.ModShieldTileEntityRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, morevanillashields.MOD_ID);

    //Shield
    public static final RegistryObject<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(196).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.LEATHER_SHIELD_DURABILITY.get();
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });



    public static final RegistryObject<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(322).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GOLD_SHIELD_DURABILITY.get();
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512).tab(CreativeModeTab.TAB_COMBAT)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.DIAMOND_SHIELD_DURABILITY.get();
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> GLASS_SHIELD = ITEMS.register("glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> TINTED_GLASS_SHIELD = ITEMS.register("tinted_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.TINTED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> BROWN_STAINED_GLASS_SHIELD = ITEMS.register("brown_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.BROWN_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> BLUE_STAINED_GLASS_SHIELD = ITEMS.register("blue_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.BLUE_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> CYAN_STAINED_GLASS_SHIELD = ITEMS.register("cyan_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.CYAN_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_GLASS_SHIELD = ITEMS.register("light_blue_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> GREEN_STAINED_GLASS_SHIELD = ITEMS.register("green_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GREEN_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> LIME_STAINED_GLASS_SHIELD = ITEMS.register("lime_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.LIME_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> YELLOW_STAINED_GLASS_SHIELD = ITEMS.register("yellow_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.YELLOW_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> PINK_STAINED_GLASS_SHIELD = ITEMS.register("pink_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.PINK_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> ORANGE_STAINED_GLASS_SHIELD = ITEMS.register("orange_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.ORANGE_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> RED_STAINED_GLASS_SHIELD = ITEMS.register("red_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.RED_STAINED_GLASS_SHIELD_DURABILITY.get();
                }
            });

    public static final RegistryObject<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(2042).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.NETHERITE_SHIELD_DURABILITY.get();
                }

                @Override
                public boolean isFireResistant() {
                    return true;
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.EMERALD_SHIELD_DURABILITY.get();
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(432).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.AMETHYST_SHIELD_DURABILITY.get();
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(610).tab(CreativeModeTab.TAB_COMBAT)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.OBSIDIAN_SHIELD_DURABILITY.get();
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> COAL_SHIELD = ITEMS.register("coal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(268).tab(CreativeModeTab.TAB_COMBAT)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.COAL_SHIELD_DURABILITY.get();
                }

                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 2400;
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(750).tab(CreativeModeTab.TAB_COMBAT)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.END_CRYSTAL_SHIELD_DURABILITY.get();
                }

                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get() && Minecraft.getInstance().options.advancedItemTooltips) {
                        if (ShieldConfig.EXPLOSION_DESTROY_BLOCKS.get()) {
                            components.add(new TranslatableComponent("item.moditems.end_crystal_shield_destroy_blocks_enabled").withStyle(ChatFormatting.DARK_AQUA));
                        }
                        else {
                            components.add(new TranslatableComponent("item.moditems.end_crystal_shield_destroy_blocks_disabled").withStyle(ChatFormatting.DARK_AQUA));
                        }
                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> ENDER_PEARL_SHIELD = ITEMS.register("ender_pearl_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(187).tab(CreativeModeTab.TAB_COMBAT)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.ENDER_PEARL_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (ShieldConfig.ENABLE_TOOLTIPS.get() && Minecraft.getInstance().options.advancedItemTooltips) {
                        if (ShieldConfig.ENABLE_TELEPORTATION.get()) {
                            components.add(new TranslatableComponent("item.moditems.ender_pearl_shield_teleportation_enabled").withStyle(ChatFormatting.DARK_AQUA));
                        }
                        else {
                            components.add(new TranslatableComponent("item.moditems.ender_pearl_shield_teleportation_disabled").withStyle(ChatFormatting.DARK_AQUA));
                        }
                        super.appendHoverText(stack, level, components, flag);
                    }
                }


                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> COPPER_SHIELD = ITEMS.register("copper_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(325).tab(CreativeModeTab.TAB_COMBAT)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.COPPER_SHIELD_DURABILITY.get();
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }

            });

    public static final RegistryObject<Item> MAGMA_SHIELD = ITEMS.register("magma_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(255).tab(CreativeModeTab.TAB_COMBAT)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.MAGMA_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
                    if (ShieldConfig.ENABLE_TOOLTIPS.get() && Minecraft.getInstance().options.advancedItemTooltips) {
                        if (ShieldConfig.ENABLE_MAGMA_BURN.get()) {
                            components.add(new TranslatableComponent("item.moditems.magma_shield_burn_enabled").withStyle(ChatFormatting.DARK_AQUA));
                        }
                        else {
                            components.add(new TranslatableComponent("item.moditems.magma_shield_burn_disabled").withStyle(ChatFormatting.DARK_AQUA));
                        }
                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {

                    if(ShieldConfig.ENABLE_MAGMA_BURN.get()) {

                        if (ShieldConfig.ENABLE_PARTICLES.get()) {

                            float yaw = -pLivingEntity.getYRot();
                            float pitch = -pLivingEntity.getXRot();

                            double offsetX = 0.5 * Math.sin(Math.toRadians(yaw));
                            double offsetY = 0.5 * Math.sin(Math.toRadians(pitch));
                            double offsetZ = 0.5 * Math.cos(Math.toRadians(yaw));

                            ModVector3d offsetVector = new ModVector3d(0.0, 0.0, 0.0);

                            offsetVector.rotateX(-pitch * Math.PI / 180.0);
                            offsetVector.rotateZ(-yaw * Math.PI / 180.0);

                            offsetX += offsetVector.x;
                            offsetY += offsetVector.y;
                            offsetZ += offsetVector.z;

                            Random rand = new Random();

                            if (!pLevel.isClientSide) {

                                ServerLevel pServerLevel = (ServerLevel) pLevel;

                                for (double countparticles = 0; countparticles <= ShieldConfig.MAGMA_SHIELD_DENSITY.get(); ++countparticles) {
                                    pServerLevel.sendParticles(
                                            ParticleTypes.SMALL_FLAME,
                                            (pLivingEntity.position().x + offsetX) + (rand.nextDouble() - 0.5D),
                                            (pLivingEntity.position().y + offsetY) + (rand.nextDouble() + 0.5D),
                                            (pLivingEntity.position().z + offsetZ) + (rand.nextDouble() - 0.5D),
                                            1,
                                            0.0,
                                            0.0,
                                            0.0,
                                            0.1
                                    );
                                }
                            }
                        }
                    }
                }


                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final RegistryObject<Item> REDSTONE_SHIELD = ITEMS.register("redstone_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(250).tab(CreativeModeTab.TAB_COMBAT)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.REDSTONE_SHIELD_DURABILITY.get();
                }

                @Override
                @SuppressWarnings("deprecation")
                public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
                    if(ShieldConfig.ENABLE_PARTICLES.get()) {

                        float pAlpha = 1;
                        float yaw = -pLivingEntity.getYRot();
                        float pitch = -pLivingEntity.getXRot();

                        double offsetX = 0.5 * Math.sin(Math.toRadians(yaw));
                        double offsetY = 0.5 * Math.sin(Math.toRadians(pitch));
                        double offsetZ = 0.5 * Math.cos(Math.toRadians(yaw));

                        ModVector3d offsetVector = new ModVector3d(0.0, 0.0, 0.0);

                        offsetVector.rotateX(-pitch * Math.PI / 180.0);
                        offsetVector.rotateZ(-yaw * Math.PI / 180.0);

                        offsetX += offsetVector.x;
                        offsetY += offsetVector.y;
                        offsetZ += offsetVector.z;

                        Random rand = new Random();

                        if (!pLevel.isClientSide) {

                            ServerLevel pServerLevel = (ServerLevel) pLevel;

                            for (double countparticles = 0; countparticles <= ShieldConfig.REDSTONE_SHIELD_DENSITY.get(); ++countparticles) {
                                pServerLevel.sendParticles(
                                        new DustParticleOptions(DustParticleOptions.REDSTONE_PARTICLE_COLOR, pAlpha),
                                        (pLivingEntity.position().x + offsetX) + (rand.nextDouble() - 0.5D),
                                        (pLivingEntity.position().y + offsetY) + (rand.nextDouble() + 0.5D),
                                        (pLivingEntity.position().z + offsetZ) + (rand.nextDouble() - 0.5D),
                                        1,
                                        0.0,
                                        0.0,
                                        0.0,
                                        1.0
                                );
                            }
                        }

                        /*for (double countparticles = 0; countparticles <= ShieldConfig.REDSTONE_SHIELD_DENSITY.get(); ++countparticles) {
                            pLevel.addParticle(new DustParticleOptions(DustParticleOptions.REDSTONE_PARTICLE_COLOR, pAlpha),
                                    (pLivingEntity.position().x + offsetX) + (rand.nextDouble() - 0.5D),
                                    (pLivingEntity.position().y + offsetY) + (rand.nextDouble() + 0.5D),
                                    (pLivingEntity.position().z + offsetZ) + (rand.nextDouble() - 0.5D),
                                    0.0, 0.0, 0.0);
                        }*/
                    }
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get() && Minecraft.getInstance().options.advancedItemTooltips) {
                        if(ShieldConfig.ENABLE_PARTICLES.get()) {
                            components.add(new TranslatableComponent("item.moditems.redstone_shield.particles_enabled").withStyle(ChatFormatting.DARK_AQUA));
                        }
                        else {
                            components.add(new TranslatableComponent("item.moditems.redstone_shield.particles_disabled").withStyle(ChatFormatting.DARK_AQUA));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                    consumer.accept(new IItemRenderProperties() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }

            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
