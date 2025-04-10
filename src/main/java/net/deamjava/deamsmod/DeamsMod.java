package net.deamjava.deamsmod;

import net.deamjava.deamsmod.block.ModBlocks;
import net.deamjava.deamsmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//change in mod
public class DeamsMod implements ModInitializer {
	public static final String MOD_ID = "deamsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}