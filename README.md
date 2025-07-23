# NutritionMod - A Delicious Balance

## 🍽️ Nourishment Redefined
A holistic nutrition system that transforms how you experience food in Minecraft. Every bite matters as you balance:

- **Proteins** for strength  
- **Carbs** for energy  
- **Fats** for resilience  
- **Vitamins** for vitality  
- **Minerals** for endurance  

## � The Art of Eating Well
Discover hidden depths in familiar foods:
- That golden carrot isn't just filling - it's packed with vision-enhancing nutrients
- Simple bread becomes complex carbs for sustained exploration
- Meat varieties offer unique protein profiles

## � Consequences & Rewards
Your body remembers what you feed it:
- Consistent balanced meals grant subtle advantages
- Monotonous diets lead to gradual deficiencies
- Extreme excesses create temporary conditions

## � Natural Integration
All vanilla foods automatically participate in this system while maintaining their original flavors and uses. No items are replaced - only enhanced with nutritional purpose.

## The data of this mod is stored in the form of data packets

### 📦 Data Pack Integration
**structure of datapack**

📂 `nutricraft_datapack`
└─ 📂 `data`
        └─ 📂 `nutricraft`
              └─ 📂 `foods`
                 ├─  `beef.json` 
                 ├─  `golden_carrot.json`
                 └─ ... (all food items)


**structure data**
```json
{
  "type": "nutricraft:food_nutrients",
  "food_item": "minecraft:beef",
  "nutrients": {
    "protein": 8.0,
    "carbs": 0.5,
    "fat": 5.0,
    "vitamins": {
      "B12": 2.0
    },
    "minerals": {
      "iron": 1.5
    }
  }
}
```

*"You are what you eat" takes on new meaning...*
