
package net.mcreator.core.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.core.entity.PoisonFrogEntity;
import net.mcreator.core.client.model.ModelFrog;

public class PoisonFrogRenderer extends MobRenderer<PoisonFrogEntity, ModelFrog<PoisonFrogEntity>> {
	public PoisonFrogRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFrog(context.bakeLayer(ModelFrog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PoisonFrogEntity entity) {
		return new ResourceLocation("core:textures/frogpoison.png");
	}
}
