package com.cursee.more_beautiful_torches_bop.core.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksForge {

    public static void register() {}

    public static final RegistryObject<Block> TEST_TORCH = RegistryForge.registerSimpleBlockAndBlockItem("test_torch", () -> new Block(BlockBehaviour.Properties.of().lightLevel((state) -> 8)));
}
