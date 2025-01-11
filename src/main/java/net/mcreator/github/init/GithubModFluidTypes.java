
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.github.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.github.fluid.types.PlacebleMilkFluidType;
import net.mcreator.github.GithubMod;

public class GithubModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, GithubMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> PLACEBLE_MILK_TYPE = REGISTRY.register("placeble_milk", () -> new PlacebleMilkFluidType());
}
