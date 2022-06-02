
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.core.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.core.block.SoulQuartzOreBlock;
import net.mcreator.core.block.SoulQuartzBlocksBlock;
import net.mcreator.core.block.SilverOreDeepBlock;
import net.mcreator.core.block.SilverOreBlock;
import net.mcreator.core.block.SilverBlockBlock;
import net.mcreator.core.block.RoseBlock;
import net.mcreator.core.block.RhyoliteBlock;
import net.mcreator.core.block.RedrockBlock;
import net.mcreator.core.block.MudBricksBlock;
import net.mcreator.core.block.MudBlock;
import net.mcreator.core.block.LimestoneBlock;
import net.mcreator.core.block.HardenedMudBlock;
import net.mcreator.core.block.GlowshroomStemBlock;
import net.mcreator.core.block.GlowshroomCapBlock;
import net.mcreator.core.block.FallleavesoBlock;
import net.mcreator.core.block.FallLeavesYBlock;
import net.mcreator.core.block.FallLeavesRBlock;
import net.mcreator.core.block.DeepslateCobaltBlock;
import net.mcreator.core.block.CobaltOreBlock;
import net.mcreator.core.block.CherryLeavesBlock;
import net.mcreator.core.block.AshwoodWoodBlock;
import net.mcreator.core.block.AshwoodTrapdoorBlock;
import net.mcreator.core.block.AshwoodPlankBlock;
import net.mcreator.core.block.AshwoodLogBlock;
import net.mcreator.core.block.AshwoodLeavesBlock;
import net.mcreator.core.block.AshwoodDoorBlock;
import net.mcreator.core.CoreMod;

public class CoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoreMod.MODID);
	public static final RegistryObject<Block> FALLLEAVESO = REGISTRY.register("fallleaveso", () -> new FallleavesoBlock());
	public static final RegistryObject<Block> FALL_LEAVES_Y = REGISTRY.register("fall_leaves_y", () -> new FallLeavesYBlock());
	public static final RegistryObject<Block> FALL_LEAVES_R = REGISTRY.register("fall_leaves_r", () -> new FallLeavesRBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_ORE_DEEP = REGISTRY.register("silver_ore_deep", () -> new SilverOreDeepBlock());
	public static final RegistryObject<Block> ROSE = REGISTRY.register("rose", () -> new RoseBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> REDROCK = REGISTRY.register("redrock", () -> new RedrockBlock());
	public static final RegistryObject<Block> CHERRY_LEAVES = REGISTRY.register("cherry_leaves", () -> new CherryLeavesBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> ASHWOOD_LOG = REGISTRY.register("ashwood_log", () -> new AshwoodLogBlock());
	public static final RegistryObject<Block> ASHWOOD_PLANK = REGISTRY.register("ashwood_plank", () -> new AshwoodPlankBlock());
	public static final RegistryObject<Block> ASHWOOD_DOOR = REGISTRY.register("ashwood_door", () -> new AshwoodDoorBlock());
	public static final RegistryObject<Block> ASHWOOD_WOOD = REGISTRY.register("ashwood_wood", () -> new AshwoodWoodBlock());
	public static final RegistryObject<Block> ASHWOOD_TRAPDOOR = REGISTRY.register("ashwood_trapdoor", () -> new AshwoodTrapdoorBlock());
	public static final RegistryObject<Block> COBALT_ORE = REGISTRY.register("cobalt_ore", () -> new CobaltOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_COBALT = REGISTRY.register("deepslate_cobalt", () -> new DeepslateCobaltBlock());
	public static final RegistryObject<Block> ASHWOOD_LEAVES = REGISTRY.register("ashwood_leaves", () -> new AshwoodLeavesBlock());
	public static final RegistryObject<Block> SOUL_QUARTZ_BLOCKS = REGISTRY.register("soul_quartz_blocks", () -> new SoulQuartzBlocksBlock());
	public static final RegistryObject<Block> RHYOLITE = REGISTRY.register("rhyolite", () -> new RhyoliteBlock());
	public static final RegistryObject<Block> SOUL_QUARTZ_ORE = REGISTRY.register("soul_quartz_ore", () -> new SoulQuartzOreBlock());
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new MudBlock());
	public static final RegistryObject<Block> HARDENED_MUD = REGISTRY.register("hardened_mud", () -> new HardenedMudBlock());
	public static final RegistryObject<Block> MUD_BRICKS = REGISTRY.register("mud_bricks", () -> new MudBricksBlock());
	public static final RegistryObject<Block> GLOWSHROOM_CAP = REGISTRY.register("glowshroom_cap", () -> new GlowshroomCapBlock());
	public static final RegistryObject<Block> GLOWSHROOM_STEM = REGISTRY.register("glowshroom_stem", () -> new GlowshroomStemBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FallleavesoBlock.registerRenderLayer();
			FallLeavesYBlock.registerRenderLayer();
			FallLeavesRBlock.registerRenderLayer();
			RoseBlock.registerRenderLayer();
			CherryLeavesBlock.registerRenderLayer();
			AshwoodDoorBlock.registerRenderLayer();
			AshwoodTrapdoorBlock.registerRenderLayer();
			AshwoodLeavesBlock.registerRenderLayer();
			MudBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			AshwoodLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			AshwoodLeavesBlock.itemColorLoad(event);
		}
	}
}
