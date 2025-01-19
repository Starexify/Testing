package net.nova.testing;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ShieldItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class Testing implements ModInitializer {
    public static final String MODID = "testing";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        Item TEMPLATE_SHIELD_1 = registerItem("template_shield_1", ShieldItem::new);
        Item TEMPLATE_SHIELD_2 = registerItem("template_shield_2", TemplateShieldItem::new);
    }

    public static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        return register(name, factory, new Item.Settings());
    }

    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, rl(name)), factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, rl(name)))));
    }

    public static Identifier rl(String path) {
        return Identifier.of(MODID, path);
    }
}