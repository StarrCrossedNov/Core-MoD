
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.core.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.core.item.SilverNuggetItem;
import net.mcreator.core.item.SilverIngotItem;
import net.mcreator.core.item.RawSilverItem;
import net.mcreator.core.item.CobaltDustItem;
import net.mcreator.core.CoreMod;

public class CoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoreMod.MODID);
	public static final RegistryObject<Item> FALLLEAVESO = block(CoreModBlocks.FALLLEAVESO, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FALL_LEAVES_Y = block(CoreModBlocks.FALL_LEAVES_Y, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FALL_LEAVES_R = block(CoreModBlocks.FALL_LEAVES_R, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> SILVER_ORE = block(CoreModBlocks.SILVER_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SILVER_ORE_DEEP = block(CoreModBlocks.SILVER_ORE_DEEP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ROSE = block(CoreModBlocks.ROSE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SILVER_BLOCK = block(CoreModBlocks.SILVER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> REDROCK = block(CoreModBlocks.REDROCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final RegistryObject<Item> CHERRY_LEAVES = block(CoreModBlocks.CHERRY_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> LIMESTONE = block(CoreModBlocks.LIMESTONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TERMITE = REGISTRY.register("termite_spawn_egg",
			() -> new ForgeSpawnEggItem(CoreModEntities.TERMITE, -8563957, -3037108, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ASHWOOD_LOG = block(CoreModBlocks.ASHWOOD_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASHWOOD_PLANK = block(CoreModBlocks.ASHWOOD_PLANK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASHWOOD_DOOR = doubleBlock(CoreModBlocks.ASHWOOD_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ASHWOOD_WOOD = block(CoreModBlocks.ASHWOOD_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASHWOOD_TRAPDOOR = block(CoreModBlocks.ASHWOOD_TRAPDOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> COBALT_DUST = REGISTRY.register("cobalt_dust", () -> new CobaltDustItem());
	public static final RegistryObject<Item> COBALT_ORE = block(CoreModBlocks.COBALT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DEEPSLATE_COBALT = block(CoreModBlocks.DEEPSLATE_COBALT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ASHWOOD_LEAVES = block(CoreModBlocks.ASHWOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SOUL_QUARTZ_BLOCKS = block(CoreModBlocks.SOUL_QUARTZ_BLOCKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RHYOLITE = block(CoreModBlocks.RHYOLITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOUL_QUARTZ_ORE = block(CoreModBlocks.SOUL_QUARTZ_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUD = block(CoreModBlocks.MUD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HARDENED_MUD = block(CoreModBlocks.HARDENED_MUD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUD_BRICKS = block(CoreModBlocks.MUD_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GLOWSHROOM_CAP = block(CoreModBlocks.GLOWSHROOM_CAP, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GLOWSHROOM_STEM = block(CoreModBlocks.GLOWSHROOM_STEM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FROG = REGISTRY.register("frog_spawn_egg",
			() -> new ForgeSpawnEggItem(CoreModEntities.FROG, -16751104, -13210, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> POISON_FROG = REGISTRY.register("poison_frog_spawn_egg",
			() -> new ForgeSpawnEggItem(CoreModEntities.POISON_FROG, -3289811, -13688299, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
