
package net.mcreator.github.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.github.procedures.PlacebleMilkMobplayerCollidesBlockProcedure;
import net.mcreator.github.init.GithubModFluids;

public class PlacebleMilkBlock extends LiquidBlock {
	public PlacebleMilkBlock() {
		super(GithubModFluids.PLACEBLE_MILK.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).lightLevel(s -> 3).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		PlacebleMilkMobplayerCollidesBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
