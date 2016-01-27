package com.topfight3r.firstmod.world;

import java.util.Random;

import com.topfight3r.firstmod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class TeaOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()){
		case -1:
			generateSurface(world, random, chunkX *16, chunkZ *16);
			//generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(world, random, chunkX *16, chunkZ*16);
			//generateOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateSurface(world, random, chunkX, chunkZ);
			//generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}

	}
	
	public static void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		for(int i =0; i<16; i++){
			int defaultChunkSize=16;
			int xPos = chunkX + rand.nextInt(defaultChunkSize);
			int zPos = chunkZ + rand.nextInt(defaultChunkSize);
			int yPos = rand.nextInt(20);
			BlockPos bPos = new BlockPos(xPos, yPos, zPos);
			(new WorldGenMinable(ModBlocks.test_block.getDefaultState(), 10)).generate(world, rand, bPos);
		}
	}
	
	/*
	 * @param block
	 * @param blockSpawn the block that is spawned
	 * @param random
	 * @param world the current world (?)
	 * @param posX the x position
	 * @param posZ the z position
	 * @param minY minimum y spawning position
	 * @param maxY maximum y spawning position
	 * @param minVein smallest vein
	 * @param maxVein largest vein
	 * @param spawnChance the chance itll spawn
	 */
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVein, int maxVein, int spawnChance){
		for(int i =0; i<spawnChance; i++){
			int defaultChunkSize=16;
			int xPos = posX + random.nextInt(defaultChunkSize);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY-minY);
			new WorldGenMinable(null, yPos);
			
		//	new WorldGenMinable(block, (minVein+random.nextInt(maxVein-minVein)), blockSpawn);
			//new WorldGenMinable(block, (minVein+random.nextInt(maxVein-minVein)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int i, int j, World world) {
		
		
	}

	private void generateOverworld(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub
		
	}

	private void generateNether(Random random, int i, int j, World world) {
		// TODO Auto-generated method stub
		
	}

}
