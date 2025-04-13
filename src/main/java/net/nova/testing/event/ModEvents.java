package net.nova.testing.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;

import static net.nova.testing.Testing.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEvents {

    // Lets you create Attributes for Entities
    @SubscribeEvent
    public static void addAttribute(EntityAttributeCreationEvent event) {
        //event.put(EntityType.PLAYER, new AttributeSupplier.Builder().build());
    }

    // Lets you modify the Attributes to Entities
    @SubscribeEvent
    public static void addAttribute(EntityAttributeModificationEvent event) {
        //event.add(EntityType.PLAYER, Attributes.ATTACK_DAMAGE, 1);
    }
}
