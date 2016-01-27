package com.topfight3r.firstmod.proxy;

import com.topfight3r.firstmod.init.ModBlocks;
import com.topfight3r.firstmod.init.ModItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		ModBlocks.registerRenders();
		ModItems.registerRenders();
	}
}
