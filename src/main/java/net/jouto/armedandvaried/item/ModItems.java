package net.jouto.armedandvaried.item;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArmedAndVaried.MODID);

    /// MISC ITEMS

    public static final RegistryObject<Item> LEATHER_SCRAP = ITEMS.register("leather_scrap",
            () -> new Item(new Item.Properties()));

    /// ROSE GOLD ITEMS

    public static final RegistryObject<Item> COPPER_GOLD_MASS = ITEMS.register("copper_gold_mass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_APPLE = ITEMS.register("rose_gold_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ROSE_GOLD_APPLE)));

    public static final RegistryObject<Item> ROSE_GOLD_CARROT = ITEMS.register("rose_gold_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.ROSE_GOLD_CARROT)));

    /// ROSE GOLD TOOLS

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(ModToolTiers.ROSE_GOLD_INGOT, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ROSE_GOLD_INGOT, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(ModToolTiers.ROSE_GOLD_INGOT, 5, -3F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(ModToolTiers.ROSE_GOLD_INGOT, 1.5F, -3F, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(ModToolTiers.ROSE_GOLD_INGOT, -3, 0, new Item.Properties()));

    /// ROSE GOLD ARMOR

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(ModArmorMaterials.ROSE_GOLD_INGOT, ArmorItem.Type.BOOTS, new Item.Properties()));

    /// EMERALD TOOLS

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 6F, -3F, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, 2F, -3F, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, -2, -0.5F, new Item.Properties()));

    ///EMERALD ARMOR

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));

    /// COPPER TOOLS

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER_INGOT, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER_INGOT, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER_INGOT, 7f, -3.1F, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER_INGOT, 2F, -3F, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER_INGOT, -1, -1.5F, new Item.Properties()));

    ///COPPER ARMOR

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER_INGOT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
