package com.topfight3r.firstmod;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

public class OverrideItemTool extends ItemTool {

	public OverrideItemTool(float attackDamage, ToolMaterial material, Set<Block> effectiveBlocks) {
		super(attackDamage, material, effectiveBlocks);
	}

}
