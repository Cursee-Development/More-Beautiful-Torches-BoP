package com.cursee.more_beautiful_torches_bop.core.common.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabsForge {

    public static void register() {}

    public static final RegistryObject<CreativeModeTab> MBT_BOP_TAB = RegistryForge.registerCreativeModeTab("mbt_bop_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> new ItemStack(ModBlocksForge.TEST_TORCH.get()))
            .title(Component.translatable("itemGroup.moreBeautifulTorchesBoP"))
            .displayItems((displayParameters, output) -> {})
            .build());
}
