package net.blobmAster.testmod.util;

import net.blobmAster.testmod.Testmod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{

        //put code here

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Testmod.MOD_ID, name));
        }
    }

    public static  class  Items{

        //put code here


        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Testmod.MOD_ID, name));

        }
    }

}
