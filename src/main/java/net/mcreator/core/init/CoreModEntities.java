
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.core.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.core.entity.TermiteEntity;
import net.mcreator.core.entity.PoisonFrogEntity;
import net.mcreator.core.entity.FrogEntity;
import net.mcreator.core.CoreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoreModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CoreMod.MODID);
	public static final RegistryObject<EntityType<TermiteEntity>> TERMITE = register("termite",
			EntityType.Builder.<TermiteEntity>of(TermiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TermiteEntity::new)

					.sized(0.7f, 0.8f));
	public static final RegistryObject<EntityType<FrogEntity>> FROG = register("frog",
			EntityType.Builder.<FrogEntity>of(FrogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FrogEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<PoisonFrogEntity>> POISON_FROG = register("poison_frog",
			EntityType.Builder.<PoisonFrogEntity>of(PoisonFrogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonFrogEntity::new)

					.sized(0.6f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TermiteEntity.init();
			FrogEntity.init();
			PoisonFrogEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TERMITE.get(), TermiteEntity.createAttributes().build());
		event.put(FROG.get(), FrogEntity.createAttributes().build());
		event.put(POISON_FROG.get(), PoisonFrogEntity.createAttributes().build());
	}
}
