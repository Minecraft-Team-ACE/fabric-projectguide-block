package com.github.mcteamace.projectguide.yourblockmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class YourBlock extends Block {

  public YourBlock(Settings settings) {
    super(settings);
  }

  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    System.out.println("YourBlock::Callback::onUse");

    return ActionResult.PASS;
  }

  @Override
  public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
    System.out.println("YourBlock::Callback::onSteppedOn");
  }

  @Override
  public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
    System.out.println("YourBlock::Callback::onLandedOn");
  }
}
