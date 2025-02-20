package net.nova.testing.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.entity.EntityEvent;

import static net.nova.testing.Testing.MODID;

@EventBusSubscriber(modid = MODID)
public class Events {

    // Lets you add new Blocks to Block Entities
    @SubscribeEvent
    public static void addBlockToBE(BlockEntityTypeAddBlocksEvent event) {
        // event.modify(BlockEntityType.HANGING_SIGN, Blocks.LIGHT_BLUE_WOOL);
    }

    // Lets you fire logic on Entity constructor
    public static void entityConstruct(EntityEvent.EntityConstructing event) {

    }
}
