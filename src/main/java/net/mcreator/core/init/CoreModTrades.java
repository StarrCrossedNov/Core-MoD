
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.core.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CoreModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.FISHERMAN) {
			trades.get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.COD),
					new ItemStack(CoreModItems.SILVER_INGOT.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.SPYGLASS), 10, 5, 0.05f));
		}
	}
}
