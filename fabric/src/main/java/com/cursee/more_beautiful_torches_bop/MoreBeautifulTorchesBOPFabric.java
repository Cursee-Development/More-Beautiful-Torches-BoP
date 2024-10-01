package com.cursee.more_beautiful_torches_bop;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import net.fabricmc.api.ModInitializer;

public class MoreBeautifulTorchesBOPFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        MoreBeautifulTorchesBOP.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        MoreBeautifulTorchesBOP.debugCommon = MonoLibConfiguration.debugging;
    }
}
