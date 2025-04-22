package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int roll1 = 0;
        int roll2 = 0;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        System.out.println("\nWelcome to the Dice App!");
        Dice dice = new Dice();

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll(1,6);
            roll2 = dice.roll(1,6);
            int sum = roll1 + roll2;
            System.out.println("Roll " + i + ":    " + roll1 + " -- " + roll2 + "   Sum:    " + sum);

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum== 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println("\nHere are the total counts from the 100 rolls:");
        System.out.println("Number of 2s:    " + twoCounter);
        System.out.println("Number of 4s:    " + fourCounter);
        System.out.println("Number of 6s:    " + sixCounter);
        System.out.println("Number of 7s:    " + sevenCounter);
    }
}