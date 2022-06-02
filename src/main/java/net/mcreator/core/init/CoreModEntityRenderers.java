
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.core.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.core.client.renderer.TermiteRenderer;
import net.mcreator.core.client.renderer.PoisonFrogRenderer;
import net.mcreator.core.client.renderer.FrogRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CoreModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CoreModEntities.TERMITE.get(), TermiteRenderer::new);
		event.registerEntityRenderer(CoreModEntities.FROG.get(), FrogRenderer::new);
		event.registerEntityRenderer(CoreModEntities.POISON_FROG.get(), PoisonFrogRenderer::new);
	}
}
