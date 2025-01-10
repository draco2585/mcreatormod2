
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.github.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.github.entity.ChildrenofthenightEntity;
import net.mcreator.github.GithubMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GithubModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, GithubMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ChildrenofthenightEntity>> CHILDRENOFTHENIGHT = register("childrenofthenight",
			EntityType.Builder.<ChildrenofthenightEntity>of(ChildrenofthenightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ChildrenofthenightEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHILDRENOFTHENIGHT.get(), ChildrenofthenightEntity.createAttributes().build());
	}
}
