package net.jouto.armedandvaried.item;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArmedAndVaried.MODID);

    public static final RegistryObject<Item> LEATHER_SCRAP = ITEMS.register("leather_scrap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_GOLD_MASS = ITEMS.register("copper_gold_mass",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_GOLD_APPLE = ITEMS.register("rose_gold_apple",
            () -> new Item(new Item.Properties().food(ModFoods.ROSE_GOLD_APPLE)));

    public static final RegistryObject<Item> ROSE_GOLD_CARROT= ITEMS.register("rose_gold_carrot",
            () -> new Item(new Item.Properties().food(ModFoods.ROSE_GOLD_CARROT)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
