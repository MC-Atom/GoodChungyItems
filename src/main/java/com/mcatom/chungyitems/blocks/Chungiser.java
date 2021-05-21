package com.mcatom.chungyitems.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Chungiser extends Block {

    public Chungiser() {
        super(AbstractBlock.Properties.of(Material.HEAVY_METAL)
                .strength(4, 20)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops());
    }
}
