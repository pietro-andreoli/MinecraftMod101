package com.topfight3r.firstmod;

import com.topfight3r.firstmod.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//shaped recipe
		GameRegistry.addRecipe( new ItemStack(ModItems.test_item, 32), new Object[]{" X ", "XXX", " X ", 'X', Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(ModItems.my_pick, 1), new Object[]{"XXX", " Y ", " Y ", 'X', ModItems.test_item, 'Y', ModItems.my_stick});
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(ModItems.test_item, new ItemStack(Items.cake, 1), 1000.0f);
	}
}
