package net.nova.testing;

import net.fabricmc.api.ClientModInitializer;

public class TestingClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Register custom EntityRenderers
		//EntityRendererRegistry.register(EntityType.ENTITY, EntityRenderer::new);

		// Render stuff on the InGameHud (use HudLayerRegistrationCallback)
		//HudLayerRegistrationCallback.EVENT.register(layeredDrawerWrapper -> );
		//HudRenderCallback.EVENT.register((drawContext, tickCounter) -> );
	}
}