package com.github.mcteamace.projectguide.yourblockmod;

import com.github.mcteamace.projectguide.yourblockmod.blocks.YourBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class Mod implements ModInitializer {

	public static final YourBlock YOUR_BLOCK = new YourBlock(FabricBlockSettings.of(Material.WOOD).hardness(2.0f).breakByHand(true));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("yourblockmod", "your_block"), YOUR_BLOCK);
		System.out.println("Registered your block!");

		Registry.register(Registry.ITEM, new Identifier("yourblockmod", "your_block"), new BlockItem(YOUR_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
		System.out.println("Registered your block item!");

		System.out.println("Initialized your mod!");
	}
}