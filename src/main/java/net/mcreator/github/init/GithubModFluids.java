
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.github.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.github.fluid.PlacebleMilkFluid;
import net.mcreator.github.GithubMod;

public class GithubModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, GithubMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> PLACEBLE_MILK = REGISTRY.register("placeble_milk", () -> new PlacebleMilkFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PLACEBLE_MILK = REGISTRY.register("flowing_placeble_milk", () -> new PlacebleMilkFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PLACEBLE_MILK.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PLACEBLE_MILK.get(), RenderType.translucent());
		}
	}
}
