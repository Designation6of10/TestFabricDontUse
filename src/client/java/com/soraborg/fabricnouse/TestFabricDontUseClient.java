package com.soraborg.fabricnouse;

import net.fabricmc.api.ClientModInitializer;

public class TestFabricDontUseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}