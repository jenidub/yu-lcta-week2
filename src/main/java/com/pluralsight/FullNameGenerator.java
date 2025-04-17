package com.pluralsight;
import java.util.*;

public class FullNameGenerator {
    public static void main(String[] args) {
        // Init scanner to take in user input
        Scanner user_input = new Scanner(System.in);

        // Prompt user for first name
        System.out.println("What is your first name (required):    ");
        String first_name = user_input.nextLine().trim();

        // Prompt user for middle name
        System.out.println("What is your middle name (leave blank if not applicable):   ");
        String middle_name = user_input.nextLine().trim();

        // Prompt user for last name
        System.out.println("What is your last name (required):    ");
        String last_name = user_input.nextLine().trim();

        // Prompt user for suffix name
        System.out.println("What is your suffix (leave blank if not applicable):     ");
        String suffix = user_input.nextLine().trim();

        // Display name
        if (middle_name.isEmpty() && suffix.isEmpty()) {
            System.out.println("Welcome " + first_name + " " + last_name + "!");
        } else if (!middle_name.isEmpty() && !suffix.isEmpty()) {
            System.out.println("Welcome " + first_name + " " + middle_name + " " + last_name + ", " + suffix + "!");
        } else if (!suffix.isEmpty()) {
            System.out.println("Welcome " + first_name + " " + last_name + ", " + suffix + "!");
        } else {
            System.out.println("Welcome " + first_name + " " + middle_name + " " + last_name + "!");
        }
    }
}