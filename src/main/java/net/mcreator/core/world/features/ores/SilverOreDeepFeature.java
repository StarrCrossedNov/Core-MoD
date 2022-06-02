
package net.mcreator.core.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.core.init.CoreModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class SilverOreDeepFeature extends OreFeature {
	public static SilverOreDeepFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SilverOreDeepFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("core:silver_ore_deep", FEATURE,
				new OreConfiguration(SilverOreDeepFeatureRuleTest.INSTANCE, CoreModBlocks.SILVER_ORE_DEEP.get().defaultBlockState(), 14));
		PLACED_FEATURE = PlacementUtils.register("core:silver_ore_deep", CONFIGURED_FEATURE, List.of(CountPlacement.of(9), InSquarePlacement.spread(),
				HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(4)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("deep_cold_ocean"), new ResourceLocation("frozen_ocean"),
			new ResourceLocation("warm_ocean"), new ResourceLocation("lukewarm_ocean"), new ResourceLocation("ocean"),
			new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("cold_ocean"), new ResourceLocation("deep_ocean"),
			new ResourceLocation("desert"), new ResourceLocation("deep_frozen_ocean"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SilverOreDeepFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class SilverOreDeepFeatureRuleTest extends RuleTest {
		static final SilverOreDeepFeatureRuleTest INSTANCE = new SilverOreDeepFeatureRuleTest();
		private static final com.mojang.serialization.Codec<SilverOreDeepFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<SilverOreDeepFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("core:silver_ore_deep_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.DEEPSLATE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
