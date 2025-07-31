package com.example.nutritionmod;

import com.example.nutritionmod.getResource.ReadDataPack;
import net.fabricmc.api.ModInitializer;

public class NutritionMod implements ModInitializer {
    public static final String CARB_KEY = "carbohydrates";
    private static final int CARB_DECREASE_INTERVAL = 200;
    private static final float CARB_DECREASE_AMOUNT = 0.5f;

    @Override
    public void onInitialize() {
        ReadDataPack.initalize();
    }
}