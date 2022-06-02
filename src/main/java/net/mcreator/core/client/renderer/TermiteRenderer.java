
package net.mcreator.core.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.core.entity.TermiteEntity;
import net.mcreator.core.client.model.Modeltermite;

public class TermiteRenderer extends MobRenderer<TermiteEntity, Modeltermite<TermiteEntity>> {
	public TermiteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltermite(context.bakeLayer(Modeltermite.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<TermiteEntity, Modeltermite<TermiteEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("core:textures/funnytermiteeyeglow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TermiteEntity entity) {
		return new ResourceLocation("core:textures/termite.png");
	}
}
