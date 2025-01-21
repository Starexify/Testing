package net.nova.testing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;

import static net.nova.testing.Testing.MODID;

@EventBusSubscriber(modid = MODID)
public class Events {
    @SubscribeEvent
    public static void addBlockToBE(BlockEntityTypeAddBlocksEvent event) {
        event.modify(BlockEntityType.HANGING_SIGN, Blocks.LIGHT_BLUE_WOOL);
    }
}
