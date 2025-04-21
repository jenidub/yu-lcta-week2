package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class TheaterReservations {
    public static void main(String[] args) {
        // Init scanner to take in user input
        Scanner user_input = new Scanner(System.in);

        // Prompt the user to enter full name - parse the first name and last name in array
        System.out.println("Enter your full name (first last):    ");
        String[] user_name = user_input.nextLine().trim().split(Pattern.quote(" "));
        System.out.println(Arrays.toString(user_name));

        // Prompt the user to enter show date
        System.out.println("What date will you be coming? (MM/DD/YYYY):    ");
        String show_date = user_input.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate show_date_formatted = LocalDate.parse(show_date, formatter);
        System.out.println(show_date_formatted);

        // Prompt the user for the # of tickets
        System.out.println("How many tickets would you like?    ");
        int ticket_quantity = user_input.nextInt();

        // Output a confirmation message for the customer based on # of tickets
        if (ticket_quantity > 1) {
            System.out.println(ticket_quantity + " tickets reserved for " + show_date_formatted + " under the name " + user_name[1] + ", " + user_name[0]);
        } else if (ticket_quantity == 1) {
            System.out.println(ticket_quantity + " ticket reserved for " + show_date_formatted + " under the name " + user_name[1] + ", " + user_name[0]);
        } else {
            System.out.println("You entered an invalid number of tickets. Please try again.");
        }
    }
}
