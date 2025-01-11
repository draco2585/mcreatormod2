
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.github.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.github.item.ToyBearItem;
import net.mcreator.github.item.SpeelItem;
import net.mcreator.github.item.PlacebleMilkItem;
import net.mcreator.github.item.NightItem;
import net.mcreator.github.item.LightningCoreItem;
import net.mcreator.github.item.CrimsonEssenceItem;
import net.mcreator.github.item.ChildsPlayItem;
import net.mcreator.github.item.ChargedBladeItem;
import net.mcreator.github.GithubMod;

public class GithubModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GithubMod.MODID);
	public static final DeferredItem<Item> CRIMSON_ESSENCE = REGISTRY.register("crimson_essence", CrimsonEssenceItem::new);
	public static final DeferredItem<Item> LIGHTNING_CORE = REGISTRY.register("lightning_core", LightningCoreItem::new);
	public static final DeferredItem<Item> CHARGED_BLADE = REGISTRY.register("charged_blade", ChargedBladeItem::new);
	public static final DeferredItem<Item> NIGHT = REGISTRY.register("night", NightItem::new);
	public static final DeferredItem<Item> TOY_BEAR = REGISTRY.register("toy_bear", ToyBearItem::new);
	public static final DeferredItem<Item> CHILDRENOFTHENIGHT_SPAWN_EGG = REGISTRY.register("childrenofthenight_spawn_egg", () -> new DeferredSpawnEggItem(GithubModEntities.CHILDRENOFTHENIGHT, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> PLACEBLE_MILK_BUCKET = REGISTRY.register("placeble_milk_bucket", PlacebleMilkItem::new);
	public static final DeferredItem<Item> CHILDS_PLAY = REGISTRY.register("childs_play", ChildsPlayItem::new);
	public static final DeferredItem<Item> SPEEL = REGISTRY.register("speel", SpeelItem::new);
	public static final DeferredItem<Item> CORELIGHT = block(GithubModBlocks.CORELIGHT);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
