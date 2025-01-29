package net.nova.testing.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static net.nova.testing.Testing.MODID;

public class TestDamageTypesProvider extends FabricDynamicRegistryProvider {
    public TestDamageTypesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup, Entries entries) {
        entries.addAll(lookup.getOrThrow(RegistryKeys.DAMAGE_TYPE));
    }

    public interface TestDamageTypes {
        RegistryKey<DamageType> TEST_DAMAGE_TYPE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(MODID, "test_damage_type"));

        static void bootstrap(Registerable<DamageType> damageTypeRegisterable) {
            damageTypeRegisterable.register(TEST_DAMAGE_TYPE, new DamageType("test_damage_type", 0.1F));
        }
    }

    @Override
    public String getName() {
        return "Test Damage Types Provider";
    }
}
