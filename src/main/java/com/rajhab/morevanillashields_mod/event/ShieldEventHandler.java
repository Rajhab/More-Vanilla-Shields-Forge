package com.rajhab.morevanillashields_mod.event;

import com.rajhab.morevanillashields_mod.ShieldConfig;
import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber
public class ShieldEventHandler {

    @SubscribeEvent
    public static void onPlayerHurt(LivingHurtEvent event) {

        if (ShieldConfig.ENABLE_EXPLOSION.get()) {

            if (event.getEntity() instanceof LivingEntity) {
                LivingEntity livingEntity = event.getEntity();

                if (!livingEntity.getCommandSenderWorld().isClientSide && livingEntity.isBlocking()) {
                    ItemStack shield = livingEntity.getUseItem();

                    if (shield.getItem() == ModItems.END_CRYSTAL_SHIELD.get()) {

                        Random random = new Random();
                        if (random.nextInt(30) == 0) {

                            boolean explosionDestroyBlocks = ShieldConfig.EXPLOSION_DESTROY_BLOCKS.get();
                            Explosion.BlockInteraction explosionType = explosionDestroyBlocks
                                    ? Explosion.BlockInteraction.BREAK
                                    : Explosion.BlockInteraction.NONE;

                            livingEntity.getCommandSenderWorld().explode(
                                    livingEntity,                   // Exploding entity (player)
                                    livingEntity.getX(),            // X coordinate
                                    livingEntity.getY(),            // Y coordinate
                                    livingEntity.getZ(),            // Z coordinate
                                    5.0F,                           // Explosion power
                                    explosionType                   // Does or does not destroy blocks
                            );

                            shield.hurtAndBreak(175, ((ServerPlayer) livingEntity), (entity) -> {
                                entity.broadcastBreakEvent(livingEntity.getUsedItemHand());
                            });
                        }
                    }
                }
            }
        }
    }
}