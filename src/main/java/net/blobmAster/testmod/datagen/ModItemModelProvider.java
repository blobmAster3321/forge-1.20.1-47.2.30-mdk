package net.blobmAster.testmod.datagen;

import net.blobmAster.testmod.Testmod;
import net.blobmAster.testmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Testmod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.GEMPART);
        simpleItem(ModItems.GEMT1);
        simpleItem(ModItems.GEMT2);
        simpleItem(ModItems.GEMT3);


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layor0",
                new ResourceLocation(Testmod.MOD_ID,"item/" + item.getId().getPath()));
    }

}
