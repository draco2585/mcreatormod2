
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.github.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.github.GithubMod;

public class GithubModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, GithubMod.MODID);
	public static final DeferredHolder<Potion, Potion> BLOOD_BIND = REGISTRY.register("blood_bind",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 5, false, false), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1200, 5, false, false), new MobEffectInstance(MobEffects.WEAKNESS, 1200, 5, false, false),
					new MobEffectInstance(MobEffects.DARKNESS, 1200, 5, false, false), new MobEffectInstance(MobEffects.POISON, 1200, 5, false, false), new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 255, false, true)));
}
