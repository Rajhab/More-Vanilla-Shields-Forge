package com.rajhab.morevanillashields_mod.event;

import com.rajhab.morevanillashields_mod.ShieldConfig;
import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@Mod.EventBusSubscriber
public class ShieldEventHandler {

    @SubscribeEvent
    public static void onPlayerHurtWithEndCrystalShield(LivingHurtEvent event) {

        if (ShieldConfig.ENABLE_EXPLOSION.get()) {

            if (event.getEntity() instanceof ServerPlayer player) {

                if (!player.getCommandSenderWorld().isClientSide && player.isBlocking()) {

                    ItemStack shield = player.getUseItem();

                    if (shield.getItem() == ModItems.END_CRYSTAL_SHIELD.get()) {

                        Random random = new Random();
                        if (random.nextInt(25) == 0) {

                            boolean explosionDestroyBlocks = ShieldConfig.EXPLOSION_DESTROY_BLOCKS.get();
                            Level.ExplosionInteraction explosionType = explosionDestroyBlocks
                                    ? Level.ExplosionInteraction.BLOCK
                                    : Level.ExplosionInteraction.NONE;

                            player.getCommandSenderWorld().explode(
                                    player,
                                    player.getX(),
                                    player.getY(),
                                    player.getZ(),
                                    5.0F,
                                    explosionType
                            );

                            shield.hurtAndBreak(65, player, (entity) -> {
                                entity.broadcastBreakEvent(player.getUsedItemHand());
                            });
                        }
                    }
                }
            }
        }
    }


    @SubscribeEvent
    public static void onPlayerHurtWithMagmaShield(LivingHurtEvent event) {

        if (ShieldConfig.ENABLE_MAGMA_BURN.get()) {

            if (event.getEntity() instanceof ServerPlayer player) {

                if (!player.getCommandSenderWorld().isClientSide && player.isBlocking()) {

                    ItemStack shield = player.getUseItem();

                    if (shield.getItem() == ModItems.MAGMA_SHIELD.get()) {

                        if (event.getSource().getEntity() instanceof LivingEntity attacker) {
                            attacker.setSecondsOnFire(5); // Set attacker on fire for 5 seconds
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerHurtWithEnderPearlShield(LivingHurtEvent event) {

        if (!ShieldConfig.ENABLE_TELEPORTATION.get()) {

            if (event.getEntity() instanceof ServerPlayer player) {

                if (!player.getCommandSenderWorld().isClientSide && player.isBlocking()) {
                    ItemStack shield = player.getUseItem();

                    if (shield.getItem() == ModItems.ENDER_PEARL_SHIELD.get()) {

                        if (event.getSource().getEntity() instanceof LivingEntity attacker) {
                            double distance = 2.5; // How far behind to teleport
                            double radians = getRadians(attacker);

                            double offsetX = -Math.sin(radians) * distance;
                            double offsetZ = Math.cos(radians) * distance;

                            double targetX = attacker.getX() + offsetX;
                            double targetY = attacker.getY();
                            double targetZ = attacker.getZ() + offsetZ;

                            // Try multiple steps forward to avoid teleporting inside blocks
                            for (double step = distance; step >= 0.5; step -= 0.5) {
                                double tryX = attacker.getX() + -Math.sin(radians) * step;
                                double tryZ = attacker.getZ() + Math.cos(radians) * step;
                                double tryY = attacker.getY();

                                if (isSafeTeleportLocation(player, tryX, tryY, tryZ)) {
                                    player.teleportTo(tryX, tryY, tryZ);

                                    Level level = player.level();
                                    ServerLevel serverLevel = (ServerLevel) level;

                                    player.teleportTo(tryX, tryY, tryZ);

                                    serverLevel.sendParticles(
                                            ParticleTypes.PORTAL,
                                            tryX,
                                            tryY + 1.0,
                                            tryZ,
                                            100,
                                            0.3,
                                            0.5,
                                            0.3,
                                            0.05);

                                    rotatePlayerToward(player, attacker);

                                    player.level().playSound(null, player.blockPosition(),
                                            SoundEvents.ENDERMAN_TELEPORT,
                                            SoundSource.PLAYERS,
                                            0.3F,
                                            1.2F
                                    );
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Picks a random angle behind attacker (180–360 range)
    private static double getRadians(LivingEntity attacker) {
        Random random = new Random();
        float attackerYaw = attacker.getYRot();

        float randomAngle = 180 + random.nextFloat() * 180;
        float finalAngle = (attackerYaw + randomAngle) % 360;

        return Math.toRadians(finalAngle);
    }


    // Rotates the player to face the attacker directly
    private static void rotatePlayerToward(ServerPlayer player, LivingEntity target) {
        double dx = target.getX() - player.getX();
        double dz = target.getZ() - player.getZ();

        float yaw = (float)(Math.toDegrees(Math.atan2(dz, dx))) - 90F;

        player.setYRot(yaw);
        player.setYHeadRot(yaw);
        player.setYBodyRot(yaw);
        //player.setXRot(0); // Optional: look straight ahead

        // Force position and rotation update to client
        player.connection.teleport(player.getX(), player.getY(), player.getZ(), yaw, player.getXRot());
    }


    // Check if the teleport location is safe
    private static boolean isSafeTeleportLocation(ServerPlayer player, double x, double y, double z) {
        var world = player.level();
        var pos = new BlockPos((int) x, (int) y, (int) z);
        var posBelow = pos.below();

        boolean airAtPos = world.getBlockState(pos).isAir();
        boolean solidBelow = world.getBlockState(posBelow).isSolidRender(world, posBelow);

        return airAtPos && solidBelow;
    }

}