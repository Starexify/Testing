package net.nova.testing.event;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

import static net.nova.testing.Testing.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEvents {

    // Lets you add new Attributes to EntitiesF
    @SubscribeEvent
    public static void addAttribute(EntityAttributeCreationEvent event) {
        event.put(EntityType.PLAYER, new AttributeSupplier.Builder().build());
    }
}
