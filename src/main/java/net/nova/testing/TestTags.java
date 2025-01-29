package net.nova.testing;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.nova.testing.Testing.MODID;

public class TestTags {

    public interface DamageTypeTags {
        TagKey<DamageType> TEST_DAMAGE_TYPE = of("test_damage_type");

        static TagKey<DamageType> of(String id) {
            return TagKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(MODID, id));
        }
    }
}
