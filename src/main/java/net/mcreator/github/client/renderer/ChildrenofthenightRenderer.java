
package net.mcreator.github.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.github.entity.ChildrenofthenightEntity;

public class ChildrenofthenightRenderer extends HumanoidMobRenderer<ChildrenofthenightEntity, HumanoidModel<ChildrenofthenightEntity>> {
	public ChildrenofthenightRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<ChildrenofthenightEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ChildrenofthenightEntity entity) {
		return ResourceLocation.parse("github:textures/entities/2024_10_03_--_-eyeless-jack-_-----hair-over-mask-22800944.png");
	}
}
