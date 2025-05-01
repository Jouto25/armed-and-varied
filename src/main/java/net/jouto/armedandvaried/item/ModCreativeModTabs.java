package net.jouto.armedandvaried.item;

import net.jouto.armedandvaried.ArmedAndVaried;
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
                        pOutput.accept(ModItems.LEATHER_SCRAP.get());
                        pOutput.accept(ModItems.COPPER_GOLD_MASS.get());
                        pOutput.accept(ModItems.ROSE_GOLD_INGOT.get());
                        pOutput.accept(ModItems.ROSE_GOLD_NUGGET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
