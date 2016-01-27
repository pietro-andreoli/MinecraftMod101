package com.topfight3r.firstmod.world;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModWorld {
	public static void mainRegistry(){
		initWorldGen();
	}
	
	public static void initWorldGen(){
		registerWorldGen(new TeaOre(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}
