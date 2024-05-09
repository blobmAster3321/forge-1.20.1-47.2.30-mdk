package net.blobmAster.testmod.item;

import net.blobmAster.testmod.Testmod;
import net.minecraft.world.item.*;
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

    public  static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F ,new Item.Properties()));

    public  static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5, -3.0F ,new Item.Properties()));

    public  static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, -2.8F ,new Item.Properties()));

    public  static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0 ,new Item.Properties()));

    public  static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F ,new Item.Properties()));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
