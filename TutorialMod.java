package com.topfight3r.firstmod;

import com.topfight3r.firstmod.init.ModBlocks;
import com.topfight3r.firstmod.init.ModItems;
import com.topfight3r.firstmod.proxy.CommonProxy;
import com.topfight3r.firstmod.world.ModWorld;
import com.topfight3r.firstmod.world.OreDictHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version=Reference.VERSION )
public class TutorialMod {
	
		@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
		public static CommonProxy proxy;
		
	
	
		//@EventHandler tells forge that these methods are used in the loadup of the game
		@EventHandler
		public void preInit(FMLPreInitializationEvent event){
			//before the loading
			//Initalizes the blocks
			ModBlocks.init();
			//Loads the blocks
			ModBlocks.register();
			//Initializes the items
			ModItems.init();
			//loads the items
			ModItems.register();
			//Loads the recipes
			CraftingManager.mainRegistry();
			
			ModWorld.mainRegistry();
			
			OreDictHandler.registerOreDict();
			
			
		}
		//@EventHandler tells forge that these methods are used in the loadup of the game
		@EventHandler
		public void init(FMLInitializationEvent event){
			//during the loading
			proxy.registerRenders();
		}
		//@EventHandler tells forge that these methods are used in the loadup of the game
		@EventHandler
		public void postInit(FMLPostInitializationEvent event){
			//after the loading
		}
}
