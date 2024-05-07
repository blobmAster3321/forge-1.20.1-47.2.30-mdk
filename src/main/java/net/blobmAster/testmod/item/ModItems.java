package net.blobmAster.testmod.item;

import net.blobmAster.testmod.Testmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Testmod.MOD_ID);
//GEMS!!!
    public  static final RegistryObject<Item> GEMPART = ITEMS.register("gempart",
            () -> new Item(new Item.Properties()));
    public  static final RegistryObject<Item> GEMT1 = ITEMS.register("gemt1",
            () -> new Item(new Item.Properties()));
    public  static final RegistryObject<Item> GEMT2 = ITEMS.register("gemt2",
            () -> new Item(new Item.Properties()));
    public  static final RegistryObject<Item> GEMT3 = ITEMS.register("gemt3",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
