package net.jouto.armedandvaried.item;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.jouto.armedandvaried.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ROSE_GOLD_INGOT = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 8.0F, 3f, 14,
                    ModTags.Blocks.NEEDS_ROSE_GOLD_TOOL, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get())),
            ResourceLocation.tryBuild(ArmedAndVaried.MODID, "rose_gold_ingot"), List.of(Tiers.IRON), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(2, 906, 7.0F, 2f, 12,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            ResourceLocation.tryBuild(ArmedAndVaried.MODID, "emerald"), List.of(Tiers.IRON), List.of());

    public static final Tier COPPER_INGOT = TierSortingRegistry.registerTier(
            new ForgeTier(2, 191, 5.0F, 1f, 14,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            ResourceLocation.tryBuild(ArmedAndVaried.MODID, "coper_ingot"), List.of(Tiers.STONE), List.of());
}
