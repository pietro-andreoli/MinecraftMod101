package com.topfight3r.firstmod.init;

import com.topfight3r.firstmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
/*Creating a new Block
 * 1. Create the Block object at the top
 * 		public static Block block_name;
 * 2. We must initialize the block in the init() method
 * 		block_name = new Block(Material.whateverMaterial).setUnlocalizedName("block_name");
 * 3. Register the block in the register() method
 * 		GameRegistry.registerBlock(block_name, block_name.getUnlocalizedName().substring(5));
 * 4. In our registerRender() method we have to register the render using 
 * 		Item item = Item.getItemFromBlock(block_name);
 * 5. Edit the registerRenders() method 
 * 		registerRender(block_name);
 * 6. Go to the ClientProxy.java class and make sure it contains ModBlocks.registerRenders();
 * 
 * Applying the texture
 * 1. Make your texture
 * 2. Save it in src/resources/assets/tm/textures/blocks
 */
public class ModBlocks {
	
	public static Block test_block;
	
	public static void init(){
		test_block = new Block(Material.cloth).setUnlocalizedName("test_block");
	}
	
	public static void register(){
		
		GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(test_block);
	}
	
	public static void registerRender(Block block){
		Item item= Item.getItemFromBlock(test_block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
