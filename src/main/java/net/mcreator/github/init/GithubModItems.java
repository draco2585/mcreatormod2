
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.github.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.github.item.LightningCoreItem;
import net.mcreator.github.item.CrimsonEssenceItem;
import net.mcreator.github.item.ChargedBladeItem;
import net.mcreator.github.GithubMod;

public class GithubModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GithubMod.MODID);
	public static final DeferredItem<Item> CRIMSON_ESSENCE = REGISTRY.register("crimson_essence", CrimsonEssenceItem::new);
	public static final DeferredItem<Item> LIGHTNING_CORE = REGISTRY.register("lightning_core", LightningCoreItem::new);
	public static final DeferredItem<Item> CHARGED_BLADE = REGISTRY.register("charged_blade", ChargedBladeItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
