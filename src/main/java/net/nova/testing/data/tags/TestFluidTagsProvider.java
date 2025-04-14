package net.nova.testing.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.nova.testing.Testing.MODID;

public class TestFluidTagsProvider extends FluidTagsProvider {
    public TestFluidTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //tag(FluidTags.LAVA).add(Fluids.FLOWING_WATER);
    }
}
