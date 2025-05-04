package net.jouto.armedandvaried.item;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    ROSE_GOLD_INGOT("rose_gold", 15, new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.of(ModItems.ROSE_GOLD_INGOT.get())),

    EMERALD("emerald", 24, new int[]{3, 6, 8, 3}, 9,
    SoundEvents.ARMOR_EQUIP_DIAMOND, 1f, 0f, () -> Ingredient.of(Items.EMERALD)),

    COPPER_INGOT("copper", 15, new int[]{1, 4, 5, 2}, 7,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(Items.COPPER_INGOT));

    private final String name;
    private final int durabilityMulitiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMulitiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMulitiplier = durabilityMulitiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMulitiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return ArmedAndVaried.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
