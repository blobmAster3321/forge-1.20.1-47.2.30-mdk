package net.blobmAster.testmod.item;

import net.blobmAster.testmod.Testmod;
import net.blobmAster.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Testmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN_MOD_TAB = CREATIVE_MODE_TABS.register("main_mod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.GEMT3.get()))
                    .title(Component.translatable("creativetab.main_mod_tab"))
                    .displayItems((pParameters,pOutput)->{
                        pOutput.accept(ModItems.GEMT1.get());
                        pOutput.accept(ModItems.GEMT2.get());
                        pOutput.accept(ModItems.GEMT3.get());
                        pOutput.accept(ModItems.GEMPART.get());
                        pOutput.accept(ModBlocks.GEM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GEM_ORE.get());
                        pOutput.accept(ModItems.EMERALD_SWORD.get());
                        pOutput.accept(ModItems.EMERALD_PICKAXE.get());
                        pOutput.accept(ModItems.EMERALD_AXE.get());
                        pOutput.accept(ModItems.EMERALD_SHOVEL.get());
                        pOutput.accept(ModItems.EMERALD_HOE.get());
                    })
                    .build());

    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
