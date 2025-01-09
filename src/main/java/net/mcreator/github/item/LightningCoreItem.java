
package net.mcreator.github.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightningCoreItem extends Item {
	public LightningCoreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
