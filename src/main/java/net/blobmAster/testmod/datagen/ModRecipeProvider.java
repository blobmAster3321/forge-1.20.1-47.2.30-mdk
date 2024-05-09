package net.blobmAster.testmod.datagen;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        //EX of how you start to add weapons and armor:
        //ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, how you get emeralds, prob how you get sticks, for tools and weapons)
            //.pattern("EEE")
            //.pattern("?S?")
            //.pattern("?S?")
            //.define (define E and S here)
            //.unlockedBy(getHasName(emeralds.get), has(emeralds.get))
            //.save(pWriter);
    }
}
