package net.nova.testing;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.nova.testing.data.TestDamageTypesProvider;
import net.nova.testing.data.tags.TestDamageTypeTagProvider;

public class DataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(TestDamageTypesProvider::new);
        pack.addProvider(TestDamageTypeTagProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder builder) {
        builder.addRegistry(RegistryKeys.DAMAGE_TYPE, TestDamageTypesProvider.TestDamageTypes::bootstrap);
    }
}
