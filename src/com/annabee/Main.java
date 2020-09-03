package com.annabee;

public class Main {

    public static void main(String[] args) {

        // I'm really new to baking cakes, so I'll just follow the recipe and not innovate
        Cake plainCake = new Cake();

        // I know a thing or two about baking and can modify recipes
        Cake customQuantitiesCake = new Cake(3, 400, 200, 250);

        // I need cake and I need it now, so bought a few ingredients for a quick fix.
        Cake shopBoughtIngredientsCake = new Cake("Cake Base", "Chocolate Filling");
    }
}
