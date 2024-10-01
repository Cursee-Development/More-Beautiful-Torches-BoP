package com.cursee.more_beautiful_torches_bop;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MoreBeautifulTorchesBOPForge {
    
    public MoreBeautifulTorchesBOPForge() {
    
        MoreBeautifulTorchesBOP.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        MoreBeautifulTorchesBOP.debugCommon = MonoLibConfiguration.debugging;
    }
}