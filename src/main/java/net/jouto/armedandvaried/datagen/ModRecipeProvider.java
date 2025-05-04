package net.jouto.armedandvaried.datagen;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.jouto.armedandvaried.block.ModBlocks;
import net.jouto.armedandvaried.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ROSE_GOLD_SMELTABLES = List.of(ModItems.COPPER_GOLD_MASS.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, ROSE_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_GOLD_MASS.get(), 1f, 200, "rose_gold");
        oreBlasting(pWriter, ROSE_GOLD_SMELTABLES, RecipeCategory.MISC, ModItems.COPPER_GOLD_MASS.get(), 1f, 100, "rose_gold");

        /// SHAPED RECIPES

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_APPLE.get())
                .pattern("RRR")
                .pattern("RAR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_CARROT.get())
                .pattern("RRR")
                .pattern("RCR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_NUGGET.get())
                .define('C', Items.GOLDEN_CARROT)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        /// CHAINMAIL ARMOR

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_HELMET)
                .pattern("III")
                .pattern("I I")
                .define('I', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_CHESTPLATE)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .define('I', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_LEGGINGS)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .define('I', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHAINMAIL_BOOTS)
                .pattern("I I")
                .pattern("I I")
                .define('I', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(pWriter);

        /// ROSE GOLD TOOLS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_SWORD.get())
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_PICKAXE.get())
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_AXE.get())
                .pattern("RR")
                .pattern("RS")
                .pattern(" S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_SHOVEL.get())
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_HOE.get())
                .pattern("RR")
                .pattern(" S")
                .pattern(" S")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        /// ROSE GOLD ARMOR

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        /// EMERALD TOOLS

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SWORD.get())
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_PICKAXE.get())
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_AXE.get())
                .pattern("EE")
                .pattern("ES")
                .pattern(" S")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_SHOVEL.get())
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HOE.get())
                .pattern("EE")
                .pattern(" S")
                .pattern(" S")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        /// EMERALD ARMOR

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_HELMET.get())
                .pattern("EEE")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EMERALD_BOOTS.get())
                .pattern("E E")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .save(pWriter);

        /// SHAPELESS RECIPES

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 9)
                .requires(ModBlocks.ROSE_GOLD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ROSE_GOLD_BLOCK.get()), has(ModBlocks.ROSE_GOLD_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .requires(ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COPPER_GOLD_MASS.get(), 1)
                .requires(Items.GOLD_INGOT)
                .requires(Items.GOLD_INGOT)
                .requires(Items.GOLD_INGOT)
                .requires(Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEATHER_SCRAP.get(), 4)
                .requires(Items.LEATHER)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, ArmedAndVaried.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
