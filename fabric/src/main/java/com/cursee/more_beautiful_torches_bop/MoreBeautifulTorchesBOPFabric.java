package com.cursee.more_beautiful_torches_bop;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_beautiful_torches_bop.core.common.registry.RegistryFabric;
import fabric.com.lupin.more_beautiful_torches.core.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.item.Item;

public class MoreBeautifulTorchesBOPFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        MoreBeautifulTorchesBOP.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        RegistryFabric.register();
    }
}
