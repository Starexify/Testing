package net.nova.testing.mixin.client;

import net.minecraft.client.renderer.entity.layers.PlayerItemInHandLayer;
import net.minecraft.world.item.TridentItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PlayerItemInHandLayer.class)
public class HeldItemRendererMixin {
    TridentItem
/*    @WrapOperation(
            method = "renderFirstPersonItem",
            constant = @Constant(classValue = ShieldItem.class)
    )
    private boolean wrapInstanceCheck(Object instance, Operation<Boolean> original) {
        return original.call(instance) || instance instanceof TemplateShieldItem;
    }*/
}