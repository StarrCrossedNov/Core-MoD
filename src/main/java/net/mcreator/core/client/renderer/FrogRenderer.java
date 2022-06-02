
package net.mcreator.core.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.core.entity.FrogEntity;
import net.mcreator.core.client.model.ModelFrog;

public class FrogRenderer extends MobRenderer<FrogEntity, ModelFrog<FrogEntity>> {
	public FrogRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFrog(context.bakeLayer(ModelFrog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrogEntity entity) {
		return new ResourceLocation("core:textures/frog.png");
	}
}
