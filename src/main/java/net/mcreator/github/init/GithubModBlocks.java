
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.github.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.github.block.PlacebleMilkBlock;
import net.mcreator.github.block.NightPortalBlock;
import net.mcreator.github.block.CorelightBlock;
import net.mcreator.github.GithubMod;

public class GithubModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GithubMod.MODID);
	public static final DeferredBlock<Block> NIGHT_PORTAL = REGISTRY.register("night_portal", NightPortalBlock::new);
	public static final DeferredBlock<Block> PLACEBLE_MILK = REGISTRY.register("placeble_milk", PlacebleMilkBlock::new);
	public static final DeferredBlock<Block> CORELIGHT = REGISTRY.register("corelight", CorelightBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
