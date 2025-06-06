package net.jouto.armedandvaried.trim;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.jouto.armedandvaried.item.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> ROSE_GOLD_INGOT = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ArmedAndVaried.MODID, "rose_gold_ingot"));

    public static void bootstrap(BootstapContext<TrimMaterial> context) {
        register(context, ROSE_GOLD_INGOT, ModItems.ROSE_GOLD_INGOT.get(), Style.EMPTY.withColor(TextColor.parseColor("#ffded6")), 1.0f);
    }

    private static void register(BootstapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item, Style style, float itemModeIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModeIndex, Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}
