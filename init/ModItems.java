package com.topfight3r.firstmod.init;

import com.topfight3r.firstmod.OverrideItemTool;
import com.topfight3r.firstmod.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
/*An item is made of the following
*1. A public static Item object with the name of the item being in item_name form
*2. Then we put the item in the init method.
*   item_name=new Item().setUnlocalizedName("item_name");
*3. Next we register the item in the register() method
*	use the GameRegistry.registerItem() and set the parameters to
*		a)the item object we made item_name
*		b)item_name.getUnlocalizedName().substring(5));
*
*4. use the parent registerRender() method in our registerRender method with the Item object as a paramter
*
*5.	Next we must register the render of the item in the registerRender() method.
*	To do this we must perform the following string of methods
*	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5), "inventory"));
*		a)getMinecraft() returns the instance of the game
*		b)getRenderItem()
*		c)getItemModelMesher()
*		d)register() the parent register method that we had overridden
*			i. The Item object
*			ii. Whatever meta is, we're just putting 0
*			iii. A ModelResourceLocation object 
*					-A string with the value "The mods ID  : The items name"
*
*/	
//Where all the items in the mod goes
public class ModItems {

		public static Item test_item;
		public static Item my_stick;
		public static Item sharingan_picaxe;
		public static Item my_pick;
		public static Item my_shovel;
		public static Item my_axe;
		public static Item my_sword;
		public static void init(){
			test_item=new Item().setUnlocalizedName("test_item");
			my_stick = new Item().setUnlocalizedName("my_stick");
			my_pick = new Item().setUnlocalizedName("my_pick");
			//my_pick = new ThisModItems()
		}
		
		public static void register(){
			//registers the item in the game and gives it the name we've assigned
			GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5)); //This method returns "tile.test_item" so we do substring(5) to get rid of "tile."
			GameRegistry.registerItem(my_stick, my_stick.getUnlocalizedName().substring(5)); //This method returns "tile.test_item" so we do substring(5) to get rid of "tile."
			GameRegistry.registerItem(my_pick, my_pick.getUnlocalizedName().substring(5));

		}
		
		public static void registerRenders(){
			registerRender(test_item);
			registerRender(my_stick);
			registerRender(my_pick);
		}
		
		public static void registerRender(Item item){
			//Client side only classs Minecraft.getMinecraft().getRenderItem()
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5), "inventory"));
		
		}
		
}
