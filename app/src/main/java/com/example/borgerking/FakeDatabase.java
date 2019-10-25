package com.example.borgerking;

import com.example.borgerking.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }


    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();


    static {
        foods.put(1, new Food(
                1,
                "Apple Pie",
                6,
                1,
                "Similar to a meat pie, but with apples.",
                R.drawable.applepie
        ));
        foods.put(2,new Food(
                2,
                "Avocado Toast",
                10,
                1,
                "Smashed avo on toast.",
                R.drawable.avocadotoast
        ));
        foods.put(3,new Food(
                3,
                "BLT Sandwich",
                10,
                1,
                "Bacon, lettice, tomato sandwich.",
                R.drawable.bltsandwich
        ));
        foods.put(4,new Food(
                4,
                "Caesar Salad",
                15,
                1,
                "Salad named after Caesar.",
                R.drawable.caesarsalad
        ));
        foods.put(5,new Food(
                5,
                "Cheese Toastie",
                5,
                1,
                "Lots of cheese in a sandwich.",
                R.drawable.cheesetoastie
        ));
        foods.put(6,new Food(
                6,
                "Chicken Burger",
                10,
                1,
                "Chicken fillets are sourced from free range chickens who have had a good life.",
                R.drawable.chickenburger
        ));
        foods.put(7,new Food(
                7,
                "Chicken Nuggets",
                10,
                1,
                "Chicken Nuggets made from real chicken",
                R.drawable.chickennuggets
        ));

        foods.put(8,new Food(
                8,
                "Chocolate Muffin",
                4,
                1,
                "Chocolate, not raisins. Chocholate muffin masterrace.",
                R.drawable.chocmuffin
        ));

        foods.put(9,new Food(
                9,
                "Bacon Egg Muffin",
                6,
                1,
                "English Bacon Egg Muffin",
                R.drawable.eggmuffin
        ));

        foods.put(10,new Food(
                10,
                "Fairy Bread",
                4,
                1,
                "Relive your childhood and get diabetes",
                R.drawable.fairybread
        ));

        foods.put(11,new Food(
                11,
                "Fish Burger",
                10,
                1,
                "Baby Shark Doo Doo Doo Doo Dooo in a burger",
                R.drawable.fishburger
        ));

        foods.put(12,new Food(
                12,
                "Fried Chicken",
                8,
                1,
                "Original recipe fried chicken purchased from Gordan Ramsay",
                R.drawable.friedchicken
        ));

        foods.put(13,new Food(
                13,
                "Frozen Coke",
                2,
                1,
                "Aussie Classic for a hot summers day",
                R.drawable.frozencoke
        ));

        foods.put(14,new Food(
                14,
                "Sweet Potato Wedges",
                6,
                1,
                "Locally sourced sweet potato fried in duck fat",
                R.drawable.sweetpotatowedges
        ));

        foods.put(15,new Food(
                15,
                "Tequila Shot",
                4,
                1,
                "Forget your troubles with a couple shots of tequila",
                R.drawable.tequilashot
        ));



    }

}
