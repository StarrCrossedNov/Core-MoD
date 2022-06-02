
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.core.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.core.CoreMod;

public class CoreModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CoreMod.MODID);
	public static final RegistryObject<ParticleType<?>> CHERRY_BLOOM = REGISTRY.register("cherry_bloom", () -> new SimpleParticleType(false));
}
