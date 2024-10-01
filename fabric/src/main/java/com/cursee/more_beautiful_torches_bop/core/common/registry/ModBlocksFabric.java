package com.cursee.more_beautiful_torches_bop.core.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocksFabric {

    public static void register() {}

    public static final Block TEST_TORCH = RegistryFabric.registerSimpleBlockAndBlockItem("test_torch", () -> new Block(BlockBehaviour.Properties.of().lightLevel((state) -> 8)));
}
