package net.nova.testing.data.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.nova.testing.TestTags;
import net.nova.testing.data.TestDamageTypesProvider;

import java.util.concurrent.CompletableFuture;

public class TestDamageTypeTagProvider extends FabricTagProvider<DamageType> {
    public TestDamageTypeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.DAMAGE_TYPE, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(TestTags.DamageTypeTags.TEST_DAMAGE_TYPE).add(TestDamageTypesProvider.TestDamageTypes.TEST_DAMAGE_TYPE);
    }
}
