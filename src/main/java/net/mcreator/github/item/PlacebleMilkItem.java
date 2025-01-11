
package net.mcreator.github.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.github.init.GithubModFluids;

public class PlacebleMilkItem extends BucketItem {
	public PlacebleMilkItem() {
		super(GithubModFluids.PLACEBLE_MILK.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
