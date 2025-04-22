package com.pluralsight;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        String[] inventory = new String[20];

        inventory[0] = "101121,Ford Explorer,Red,45000,13500";
        inventory[1] = "101122,Toyota Camry,Blue,60000,11000";
        inventory[2] = "101123,Chevrolet Malibu,Black,50000,9700";
        inventory[3] = "101124,Honda Civic,White,70000,7500";
        inventory[4] = "101125,Subaru Outback,Green,55000,14500";
        inventory[5] = "101126,Jeep Wrangler,Yellow,30000,1600";

        Scanner user_input = new Scanner(System.in);

        System.out.println("\nWhat do you want to do?    ");
        System.out.println("1 - List all vehicles");
        System.out.println("2 - Search by make/model");
        System.out.println("3 - Search by price range");
        System.out.println("4 - Search by color");
        System.out.println("5 - Add a vehicle");
        System.out.println("6 - Quit\n");

        System.out.println("Enter your command:    ");
        String command = user_input.nextLine();

        // Command 1: Show all entries in inventory
        switch(command){
            case "1":
                System.out.println("\n");
                for (int i = 0; i < inventory.length; i++) {
                    if (inventory[i] != null) {
                        System.out.println("Entry " + (i + 1) + ":  " + inventory[i]);
                    }
                }
                break;
        }

        // Command 2: Search by make/model

    }
}