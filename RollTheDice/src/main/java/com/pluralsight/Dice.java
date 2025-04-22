package com.pluralsight;

public class Dice {
    public Dice () {

    }

    public int roll(int minValue, int maxValue) {
        return (int)(Math.random() * maxValue) + minValue;
    }
}
