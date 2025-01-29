package net.nova.testing.data;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static net.nova.testing.Testing.MODID;

public interface TestDamageTypes {
    RegistryKey<DamageType> TEST_DAMAGE_TYPE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(MODID, "test_damage_type"));

    static void bootstrap(Registerable<DamageType> damageTypeRegisterable) {
        damageTypeRegisterable.register(TEST_DAMAGE_TYPE, new DamageType("test_damage_type", 0.1F));
    }
}
