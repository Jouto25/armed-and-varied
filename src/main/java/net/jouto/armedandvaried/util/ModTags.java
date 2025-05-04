package net.jouto.armedandvaried.util;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.Objects;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_ROSE_GOLD_TOOL = tag("needs_rose_gold_tool");

        public static final TagKey<Block> NEEDS_EMERALD_TOOL = tag("needs_emerald_tool");

        private  static TagKey<Block> tag(String name) {
            return BlockTags.create(Objects.requireNonNull(ResourceLocation.tryBuild(ArmedAndVaried.MODID, name)));
        }
    }
    public static class  Items {

    }
}
