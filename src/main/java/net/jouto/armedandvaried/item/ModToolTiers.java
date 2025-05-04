package net.jouto.armedandvaried.item;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.jouto.armedandvaried.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ROSE_GOLD_INGOT = TierSortingRegistry.registerTier(
            new ForgeTier(3, 250, 8.0F, 3f, 14,
                    ModTags.Blocks.NEEDS_ROSE_GOLD_TOOL, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get())),
            ResourceLocation.tryBuild(ArmedAndVaried.MODID, "rose_gold_ingot"), List.of(Tiers.DIAMOND), List.of());
}
