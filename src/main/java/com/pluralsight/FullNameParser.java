package com.pluralsight;
import java.util.*;

public class FullNameParser {
    public static void main(String[] args) {
        // Init scanner to take in user input
        Scanner user_input = new Scanner(System.in);

        // Prompt the user to enter their full name: first last or first middle last
        System.out.println("Enter your full name (first last or first middle last format):    ");
        String user_name = user_input.nextLine().trim();

        // Parse it into first, middle, last name
        String[] name_array = user_name.split(" ");
        System.out.println(Arrays.toString(name_array));

        System.out.println("First Name: " + name_array[0]);
        if (name_array.length == 3) {
            System.out.println("Middle Name: " + name_array[1]);
            System.out.println("Last Name: " + name_array[2]);
        } else {
            System.out.println("Last Name: " + name_array[1]);
        }
    }
}

