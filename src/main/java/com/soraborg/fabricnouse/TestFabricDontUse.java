package com.soraborg.fabricnouse;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFabricDontUse implements ModInitializer {
    public static final String MODID = "modid";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
    }
}