package net.nova.testing.effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.server.network.ServerPlayerEntity;

public class FlyingStatusEffect extends StatusEffect {
    public FlyingStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 14270531);
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        if (entity instanceof ServerPlayerEntity player) {
            player.getAbilities().allowFlying = true;
            player.sendAbilitiesUpdate();
        }
    }

    @Override
    public void onEntityRemoval(LivingEntity entity, int amplifier, Entity.RemovalReason reason) {
        if (entity instanceof ServerPlayerEntity player) {
            player.getAbilities().allowFlying = false;
            player.sendAbilitiesUpdate();
        }
    }

}
