package com.soraborg.fabricnouse;

import com.soraborg.fabricnouse.block.ModBlocks;
import com.soraborg.fabricnouse.item.ModItemGroup;
import com.soraborg.fabricnouse.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFabricDontUse implements ModInitializer {
    public static final String MOD_ID = "fabricnouse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        //ModBlocks.registerModBlocks();
    }
}