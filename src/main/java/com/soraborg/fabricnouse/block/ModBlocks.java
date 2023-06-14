package com.soraborg.fabricnouse.block;

import com.soraborg.fabricnouse.TestFabricDontUse;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CITRINE_BLOCK = registerBlock("citrine_block", new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TestFabricDontUse.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        TestFabricDontUse.LOGGER.debug("Registering Mod Blocks for " + TestFabricDontUse.MOD_ID);
    }
}
