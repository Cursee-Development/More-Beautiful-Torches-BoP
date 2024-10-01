package com.cursee.more_beautiful_torches_bop.core.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabsFabric {

    public static void register() {}

    public static final CreativeModeTab MBT_BOP_TAB = RegistryFabric.registerCreativeModeTab("mbt_bop_tab", () ->
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocksFabric.TEST_TORCH))
                    .title(Component.translatable("itemGroup.moreBeautifulTorchesBoP"))
                    .displayItems((displayParameters, output) -> {})
                    .build());
}
