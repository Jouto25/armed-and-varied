package net.jouto.armedandvaried.item;

import net.jouto.armedandvaried.ArmedAndVaried;
import net.jouto.armedandvaried.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArmedAndVaried.MODID);


    public static final RegistryObject<CreativeModeTab> ARMED_AND_VARIED_TAB = CREATIVE_MODE_TABS.register("armed_and_varied_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_GOLD_MASS.get()))
                    .title(Component.translatable("creativetab.armed_and_varied_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        /// MISC ITEMS
                        pOutput.accept(ModItems.LEATHER_SCRAP.get());

                        /// ROSE GOLD ITEMS
                        pOutput.accept(ModItems.COPPER_GOLD_MASS.get());
                        pOutput.accept(ModItems.ROSE_GOLD_INGOT.get());
                        pOutput.accept(ModItems.ROSE_GOLD_NUGGET.get());

                        pOutput.accept(ModBlocks.ROSE_GOLD_BLOCK.get());

                        /// ROSE GOLD FOOD
                        pOutput.accept(ModItems.ROSE_GOLD_APPLE.get());
                        pOutput.accept(ModItems.ROSE_GOLD_CARROT.get());

                        /// ROSE GOLD TOOLS
                        pOutput.accept(ModItems.ROSE_GOLD_AXE.get());
                        pOutput.accept(ModItems.ROSE_GOLD_HOE.get());
                        pOutput.accept(ModItems.ROSE_GOLD_PICKAXE.get());
                        pOutput.accept(ModItems.ROSE_GOLD_SHOVEL.get());
                        pOutput.accept(ModItems.ROSE_GOLD_SWORD.get());

                        /// ROSE GOLD ARMOR
                        pOutput.accept(ModItems.ROSE_GOLD_HELMET.get());
                        pOutput.accept(ModItems.ROSE_GOLD_CHESTPLATE.get());
                        pOutput.accept(ModItems.ROSE_GOLD_LEGGINGS.get());
                        pOutput.accept(ModItems.ROSE_GOLD_BOOTS.get());

                        /// EMERALD TOOLS
                        pOutput.accept(ModItems.EMERALD_AXE.get());
                        pOutput.accept(ModItems.EMERALD_HOE.get());
                        pOutput.accept(ModItems.EMERALD_PICKAXE.get());
                        pOutput.accept(ModItems.EMERALD_SHOVEL.get());
                        pOutput.accept(ModItems.EMERALD_SWORD.get());

                        /// EMERALD ARMOR
                        pOutput.accept(ModItems.EMERALD_HELMET.get());
                        pOutput.accept(ModItems.EMERALD_CHESTPLATE.get());
                        pOutput.accept(ModItems.EMERALD_LEGGINGS.get());
                        pOutput.accept(ModItems.EMERALD_BOOTS.get());

                        /// COPPER TOOLS
                        pOutput.accept(ModItems.COPPER_AXE.get());
                        pOutput.accept(ModItems.COPPER_HOE.get());
                        pOutput.accept(ModItems.COPPER_PICKAXE.get());
                        pOutput.accept(ModItems.COPPER_SHOVEL.get());
                        pOutput.accept(ModItems.COPPER_SWORD.get());

                        /// COPPER ARMOR
                        pOutput.accept(ModItems.COPPER_HELMET.get());
                        pOutput.accept(ModItems.COPPER_CHESTPLATE.get());
                        pOutput.accept(ModItems.COPPER_LEGGINGS.get());
                        pOutput.accept(ModItems.COPPER_BOOTS.get());

                        /// AMETHYST TOOLS
                        pOutput.accept(ModItems.AMETHYST_AXE.get());
                        pOutput.accept(ModItems.AMETHYST_HOE.get());
                        pOutput.accept(ModItems.AMETHYST_PICKAXE.get());
                        pOutput.accept(ModItems.AMETHYST_SHOVEL.get());
                        pOutput.accept(ModItems.AMETHYST_SWORD.get());

                        /// AMETHYST ARMOR
                        pOutput.accept(ModItems.AMETHYST_HELMET.get());
                        pOutput.accept(ModItems.AMETHYST_CHESTPLATE.get());
                        pOutput.accept(ModItems.AMETHYST_LEGGINGS.get());
                        pOutput.accept(ModItems.AMETHYST_BOOTS.get());

                        /// HORSE ARMOR
                        pOutput.accept(ModItems.ROSE_GOLD_HORSE_ARMOR.get());
                        pOutput.accept(ModItems.EMERALD_HORSE_ARMOR.get());
                        pOutput.accept(ModItems.COPPER_HORSE_ARMOR.get());
                        pOutput.accept(ModItems.AMETHYST_HORSE_ARMOR.get());
                        pOutput.accept(ModItems.NETHERITE_HORSE_ARMOR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
