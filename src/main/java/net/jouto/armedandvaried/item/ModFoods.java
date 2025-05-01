package net.jouto.armedandvaried.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ROSE_GOLD_APPLE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 250, 1), 1.0F).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 0), 1.0F).alwaysEat().build();
    public static final FoodProperties ROSE_GOLD_CARROT = new FoodProperties.Builder().nutrition(8).saturationMod(1.2F).build();
}
