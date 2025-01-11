
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.github.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class GithubModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == GithubModVillagerProfessions.JEFF.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(GithubModItems.CRIMSON_ESSENCE.get()), new ItemStack(GithubModItems.LIGHTNING_CORE.get()), new ItemStack(GithubModItems.CHARGED_BLADE.get()), 100, 5, 0.05f));
		}
		if (event.getType() == GithubModVillagerProfessions.JEFF.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.COPPER_BLOCK, 2), new ItemStack(GithubModItems.LIGHTNING_CORE.get()), new ItemStack(GithubModItems.CHARGED_BLADE.get()), 100, 5, 0.05f));
		}
		if (event.getType() == GithubModVillagerProfessions.JEFF.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(GithubModItems.CHARGED_BLADE.get()), new ItemStack(GithubModItems.CRIMSON_ESSENCE.get()), new ItemStack(GithubModItems.NIGHT.get()), 2, 5, 0.05f));
		}
		if (event.getType() == GithubModVillagerProfessions.JEFF.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.MILK_BUCKET), new ItemStack(GithubModItems.PLACEBLE_MILK_BUCKET.get()), 10, 5, 0.05f));
		}
	}
}
