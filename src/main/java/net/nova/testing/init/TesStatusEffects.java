package net.nova.testing.init;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.nova.testing.effects.FlyingStatusEffect;

public class TesStatusEffects {
    public static final RegistryEntry<StatusEffect> FLIGHT = register("flight",
            new FlyingStatusEffect()
    );

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.ofVanilla(id), statusEffect);
    }

    public static void init() {

    }
}
