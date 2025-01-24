package net.nova.testing;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TesTags {

    public interface DamageTypeTags {
        TagKey<DamageType> DAMAGES_HELMET = of("damages_helmet");

        private static TagKey<DamageType> of(String id) {
            return TagKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.ofVanilla(id));
        }
    }
}
