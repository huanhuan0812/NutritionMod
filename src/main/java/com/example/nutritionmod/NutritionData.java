package com.example.nutritionmod;

public class NutritionData {
    public static final int DECREASE_INTERVAL = 200; // 200ticks  10s

    public static final String CARB_KEY = "carbohydrates";
    public static final float CARB_PROPER_MAXLIMIT = 120.0f; // Maximum proper carbohydrates limit
    public static final float CARB_PROPER_MINLIMIT = 60.0f; // Minimum proper carbohydrates limit
    public static final float CARB_DANDER_LIMIT = 20.0f; // Dander carbohydrates limit
    public static final float CARB_OVER_LIMIT = 140.0f; // Over carb limit,then turns into fat
    public static final float CARB_DECREASE_AMOUNT = 0.5f; // carb/200ticks

    // Add more nutritional data fields as needed
    public static final String PROTEIN_KEY = "protein";
    public static final float PROTEIN_DECREASE_AMOUNT = 0.5f; // per tick

    public static final String FAT_KEY = "fat";

    public static final String VITAMINS_KEY = "vitamins";

    public static final String MINERALS_KEY = "minerals";

    // Add methods to manage and retrieve nutritional data if necessary
    public float CARBOHYDRATES,//碳水化合物
        PROTEINS,//蛋白质
        FATS,//脂肪
        VITAMIN_A,//维生素A
        VITAMIN_B_5,//维生素B5
        VITAMIN_B_6,//维生素B6
        VITAMIN_B_12,//维生素B12
        VITAMIN_C,//维生素C
        VITAMIN_D,//维生素D
        VITAMIN_E,//维生素E
        VITAMIN_K,//维生素K
        MINERALS_Ca,//矿物质Ca
        MINERALS_Fe,//矿物质Fe
        MINERALS_Se,//矿物质Se
        MINERALS_Zn,//矿物质Zn
        MINERALS_I,//矿物质I
        MINERALS_K;//矿物质K

}