package net.mcreator.core.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.core.init.CoreModParticleTypes;

public class CherryLeavesUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (CoreModParticleTypes.CHERRY_BLOOM.get()), x, y, z, 1, 0, 0);
	}
}
