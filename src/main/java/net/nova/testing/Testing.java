package net.nova.testing;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import net.nova.testing.init.TesStatusEffects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testing implements ModInitializer {
    public static final String MODID = "testing";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        TesStatusEffects.init();
    }

    public static ResourceLocation rl(String path) {
        return ResourceLocation.of(MODID, path);
    }
}