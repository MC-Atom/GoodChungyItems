package com.mcatom.chungyitems.data;

import com.mcatom.chungyitems.ChungyItemsMod;
import com.mcatom.chungyitems.data.client.ModBlockStateProvider;
import com.mcatom.chungyitems.data.client.ModItemStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ChungyItemsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    public DataGenerators() {

    }

    @SubscribeEvent
    public static void gatherData (GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new ModBlockStateProvider(generator,existingFileHelper));
        generator.addProvider(new ModItemStateProvider(generator,existingFileHelper));
    }
}
