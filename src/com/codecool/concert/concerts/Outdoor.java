package com.codecool.concert.concerts;

import java.util.Random;

public class Outdoor extends Concert {
    public Outdoor() {
        this.capacity = 5000;
        this.length = 2;
        this.beerPrice = 800;
        this.canceled = chanceToRain();
    }

    public boolean chanceToRain() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return number <= 30;
    }
}
