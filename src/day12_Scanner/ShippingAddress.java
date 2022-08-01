package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = keyboard.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = keyboard.next();

        keyboard.nextLine();

        System.out.println("Enter your Street name: ");
        String streetName = keyboard.nextLine();
        System.out.println("Enter your city name: ");
        String cityName = keyboard.next();
        System.out.println("Enter your state: ");
        String state = keyboard.next();
        System.out.println("Enter your zip code: ");
        String zipCode = keyboard.next();

        keyboard.nextLine();

        System.out.println("Enter your country name: ");
        String countryName = keyboard.nextLine();
        keyboard.close();

        System.out.println(fullName);
        System.out.println(buildingNumber + " " + streetName );
        System.out.println(cityName + ", " + state + " " + zipCode);
        System.out.println(countryName);

    }
}
