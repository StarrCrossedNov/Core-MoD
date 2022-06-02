
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.core.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.core.world.features.plants.RoseFeature;
import net.mcreator.core.world.features.ores.SilverOreFeature;
import net.mcreator.core.world.features.ores.SilverOreDeepFeature;
import net.mcreator.core.world.features.ores.MudFeature;
import net.mcreator.core.world.features.ores.FallLeavesYFeature;
import net.mcreator.core.world.features.ores.FallLeavesRFeature;
import net.mcreator.core.world.features.ores.DeepslateCobaltFeature;
import net.mcreator.core.world.features.ores.CobaltOreFeature;
import net.mcreator.core.CoreMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CoreModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CoreMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> FALL_LEAVES_Y = register("fall_leaves_y", FallLeavesYFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, FallLeavesYFeature.GENERATE_BIOMES, FallLeavesYFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FALL_LEAVES_R = register("fall_leaves_r", FallLeavesRFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, FallLeavesRFeature.GENERATE_BIOMES, FallLeavesRFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE_DEEP = register("silver_ore_deep", SilverOreDeepFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreDeepFeature.GENERATE_BIOMES,
					SilverOreDeepFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROSE = register("rose", RoseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RoseFeature.GENERATE_BIOMES, RoseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COBALT_ORE = register("cobalt_ore", CobaltOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CobaltOreFeature.GENERATE_BIOMES, CobaltOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_COBALT = register("deepslate_cobalt", DeepslateCobaltFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateCobaltFeature.GENERATE_BIOMES,
					DeepslateCobaltFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MUD = register("mud", MudFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MudFeature.GENERATE_BIOMES, MudFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
