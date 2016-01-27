package com.topfight3r.firstmod.world;

import com.topfight3r.firstmod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {
	public static String teaOre = "teaOre";
	
	public static void registerOreDict(){
		//OreDictionary.registerOre(teaOre, new ItemStack(ModBlocks.test_block));
		OreDictionary.registerOre(teaOre, new ItemStack(Blocks.bed));
	}
}
