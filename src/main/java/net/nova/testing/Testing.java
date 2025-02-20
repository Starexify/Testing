package net.nova.testing;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static net.nova.testing.Testing.MODID;

@Mod(MODID)
public class Testing {
    public static final String MODID = "testing";

    public Testing(IEventBus bus) {

    }

    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}