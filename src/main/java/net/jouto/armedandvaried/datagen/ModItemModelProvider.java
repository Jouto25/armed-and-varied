package net.jouto.armedandvaried.datagen;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.jouto.armedandvaried.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }



    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ArmedAndVaried.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //MISC ITEMS
        simpleItem(ModItems.LEATHER_SCRAP);

        /// ROSE GOLD ITEMS
        simpleItem(ModItems.COPPER_GOLD_MASS);
        simpleItem(ModItems.ROSE_GOLD_INGOT);
        simpleItem(ModItems.ROSE_GOLD_NUGGET);


        /// ROSE GOLD FOOD
        simpleItem(ModItems.ROSE_GOLD_APPLE);
        simpleItem(ModItems.ROSE_GOLD_CARROT);

        /// ROSE GOLD TOOLS
        handheldItem(ModItems.ROSE_GOLD_SWORD);
        handheldItem(ModItems.ROSE_GOLD_PICKAXE);
        handheldItem(ModItems.ROSE_GOLD_AXE);
        handheldItem(ModItems.ROSE_GOLD_SHOVEL);
        handheldItem(ModItems.ROSE_GOLD_HOE);

        /// ROSE GOLD ARMOR
        trimmedArmorItem(ModItems.ROSE_GOLD_HELMET);
        trimmedArmorItem(ModItems.ROSE_GOLD_CHESTPLATE);
        trimmedArmorItem(ModItems.ROSE_GOLD_LEGGINGS);
        trimmedArmorItem(ModItems.ROSE_GOLD_BOOTS);

        /// EMERALD TOOLS
        handheldItem(ModItems.EMERALD_SWORD);
        handheldItem(ModItems.EMERALD_PICKAXE);
        handheldItem(ModItems.EMERALD_AXE);
        handheldItem(ModItems.EMERALD_SHOVEL);
        handheldItem(ModItems.EMERALD_HOE);

        /// EMERALD ARMOR
        trimmedArmorItem(ModItems.EMERALD_HELMET);
        trimmedArmorItem(ModItems.EMERALD_CHESTPLATE);
        trimmedArmorItem(ModItems.EMERALD_LEGGINGS);
        trimmedArmorItem(ModItems.EMERALD_BOOTS);

        /// COPPER TOOLS
        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_SHOVEL);
        handheldItem(ModItems.COPPER_HOE);

        /// COPPER ARMOR
        trimmedArmorItem(ModItems.COPPER_HELMET);
        trimmedArmorItem(ModItems.COPPER_CHESTPLATE);
        trimmedArmorItem(ModItems.COPPER_LEGGINGS);
        trimmedArmorItem(ModItems.COPPER_BOOTS);

        /// AMETHYST TOOLS
        handheldItem(ModItems.AMETHYST_SWORD);
        handheldItem(ModItems.AMETHYST_PICKAXE);
        handheldItem(ModItems.AMETHYST_AXE);
        handheldItem(ModItems.AMETHYST_SHOVEL);
        handheldItem(ModItems.AMETHYST_HOE);

        /// AMETHYST ARMOR
        trimmedArmorItem(ModItems.AMETHYST_HELMET);
        trimmedArmorItem(ModItems.AMETHYST_CHESTPLATE);
        trimmedArmorItem(ModItems.AMETHYST_LEGGINGS);
        trimmedArmorItem(ModItems.AMETHYST_BOOTS);

        /// HORSE ARMOR
        simpleItem(ModItems.ROSE_GOLD_HORSE_ARMOR);
        simpleItem(ModItems.EMERALD_HORSE_ARMOR);
        simpleItem(ModItems.COPPER_HORSE_ARMOR);
        simpleItem(ModItems.AMETHYST_HORSE_ARMOR);
        simpleItem(ModItems.NETHERITE_HORSE_ARMOR);

    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MODID = ArmedAndVaried.MODID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.tryBuild(MODID, armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.tryParse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.tryBuild(MODID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.tryBuild(MODID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/handheld")).texture("layer0",
                ResourceLocation.tryBuild(ArmedAndVaried.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(ArmedAndVaried.MODID, "item/" + item.getId().getPath()));
    }

}
