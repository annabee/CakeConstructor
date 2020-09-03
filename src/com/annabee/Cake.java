package com.annabee;

public class Cake {

    int eggs;
    int flour;
    int butter;
    int sugar;

    public Cake() {
        eggs = 3;
        flour = 500;
        butter = 250;
        sugar = 200;

        // do something with those ingredients and return a cake
    }

    public Cake(int noOfEggs, int gramsOfFlour, int gramsOfButter, int gramsOfSugar) {
        eggs = noOfEggs;
        flour = gramsOfFlour;
        butter = gramsOfButter;
        sugar = gramsOfSugar;

        // do something with those ingredients and return a cake
    }

    public Cake(String cakeBase, String filling) {
        eggs = 0;
        flour = 0;
        butter = 0;
        sugar = 0;

        // using the base and filling make a cake
    }
}
