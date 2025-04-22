package com.pluralsight;
import java.util.*;

public class CellPhoneApplication {
    public static class CellPhone {
        // Define fields
        public String serialNumber, model, carrier, phoneNumber, owner;

        // Class definition - parameterless w/ default values
        public CellPhone() {
            this.serialNumber = "0";
            this.model = "";
            this.carrier = "";
            this.phoneNumber = "";
            this.owner = "";
        }

        public String getSerialNumber() {
            return this.serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public String getModel() {
            return this.model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getCarrier() {
            return this.carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getOwner() {
            return this.owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }

    public static void main(String[] args) {
        // Init scanner to take in user input
        Scanner user_input = new Scanner(System.in);

        // Init new cellPhone account
        CellPhone account_one = new CellPhone();

        // Init new StringBuilder to display account info at end
        StringBuilder account_info = new StringBuilder();

        // Prompt user for the required info
        System.out.println("What is the serial number of your cell phone?   ");
        account_one.serialNumber = user_input.nextLine();
        account_info.append("\nSerial Number: " + account_one.serialNumber);

        System.out.println("What is the model of the phone?   ");
        account_one.model = user_input.nextLine();
        account_info.append("\nPhone Model: " + account_one.model);

        System.out.println("Who is the phone carrier?   ");
        account_one.carrier = user_input.nextLine();
        account_info.append("\nCarrier: " + account_one.carrier);

        System.out.println("What is the phone number [###-###-####] ?   ");
        account_one.phoneNumber = user_input.nextLine();
        account_info.append("\nPhone Number: " + account_one.phoneNumber);

        System.out.println("Who is the owner of the phone?   ");
        account_one.owner = user_input.nextLine();
        account_info.insert(0, "\nAccount Owner Name: " + account_one.owner);

        System.out.println(account_info.toString());
    }
}
