
package net.mcreator.github.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.github.init.GithubModItems;
import net.mcreator.github.init.GithubModFluids;
import net.mcreator.github.init.GithubModFluidTypes;
import net.mcreator.github.init.GithubModBlocks;

public abstract class PlacebleMilkFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> GithubModFluidTypes.PLACEBLE_MILK_TYPE.get(), () -> GithubModFluids.PLACEBLE_MILK.get(), () -> GithubModFluids.FLOWING_PLACEBLE_MILK.get())
			.explosionResistance(100f).tickRate(20).bucket(() -> GithubModItems.PLACEBLE_MILK_BUCKET.get()).block(() -> (LiquidBlock) GithubModBlocks.PLACEBLE_MILK.get());

	private PlacebleMilkFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ITEM_SNOWBALL;
	}

	public static class Source extends PlacebleMilkFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PlacebleMilkFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
