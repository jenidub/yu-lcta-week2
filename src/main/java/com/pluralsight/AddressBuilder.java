package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class AddressBuilder {
    public static void main(String[] args) {
        // Init scanner to take in user input
        Scanner user_input = new Scanner(System.in);

        // Init StringBuilder variable to collect the user information
        StringBuilder user_account = new StringBuilder();

        // Intro message
        System.out.println("Please provide the following information to create your account:");

        // Prompt the User for their full name
        System.out.println("What is your full name (first last):    ");
        String user_name = user_input.nextLine();
        user_account.append("\n" + user_name + "\n");

        // Prompt the User for their billing address
        user_account.append("\nBilling Address: \n");

        System.out.println("Billing Street:   ");
        String address_street = user_input.nextLine();
        user_account.append(address_street + "\n");

        System.out.println("Billing City:   ");
        String address_city = user_input.nextLine();
        user_account.append(address_city + ", ");

        System.out.println("Billing State:   ");
        String address_state = user_input.nextLine();
        user_account.append(address_state + " ");

        System.out.println("Billing Zip:   ");
        String address_zip = user_input.nextLine();
        user_account.append(address_zip+ "\n");

//        // Prompt the User for their shipping address
//        user_account.append("\nShipping Address: \n");
//
//        System.out.println("Shipping Street:   ");
//        address_street = user_input.nextLine();
//        user_account.append(address_street + "\n");
//
//        System.out.println("Shipping City:   ");
//        address_city = user_input.nextLine();
//        user_account.append(address_city + "\n");
//
//        System.out.println("Shipping State:   ");
//        address_state = user_input.nextLine();
//        user_account.append(address_state + "\n");
//
//        System.out.println("Shipping Zip:   ");
//        address_zip = user_input.nextLine();
//        user_account.append(address_zip+ "\n");

        // Display new account information for customer
        System.out.print(user_account.toString());
    }
}
