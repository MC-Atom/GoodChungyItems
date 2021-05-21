package com.mcatom.chungyitems.setup;

import com.mcatom.chungyitems.blocks.Chungiser;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> CHUNGISER = register("chungiser", () -> new Chungiser());

    public static void register () {

    }

    private static <T extends Block>RegistryObject<T> registerNoItem (String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name,block);
    }
    private static <T extends Block>RegistryObject<T> register (String name, Supplier<T> block) {
        RegistryObject<T> output = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(output.get(),new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
        return output;
    }
}
