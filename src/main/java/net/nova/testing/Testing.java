package net.nova.testing;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testing implements ModInitializer {
    public static final String MODID = "testing";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
    }

    public static Identifier rl(String path) {
        return Identifier.of(MODID, path);
    }
}