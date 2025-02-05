package net.nova.testing.item;

import net.minecraft.world.item.Item;

public class TestItem extends Item {
    // Property to add enchantments to the item
    public TestItem(Properties properties) {
        super(properties.enchantable(1));
    }
}
