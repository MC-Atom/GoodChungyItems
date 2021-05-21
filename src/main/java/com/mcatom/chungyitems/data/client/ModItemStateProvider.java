package com.mcatom.chungyitems.data.client;

import com.mcatom.chungyitems.ChungyItemsMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IDataProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.mcatom.chungyitems.ChungyItemsMod.MOD_ID;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
    }

    private void builder (ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0","item/" + name);
    }
}
