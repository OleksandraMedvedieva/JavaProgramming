package day01_JavaIntro.week05;

import java.util.Scanner;

public class WebAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a valid website such as www.amazon.com");
        String userEntry = scanner.next();
        int indexOfFirstDot = userEntry.indexOf(".");
        int indexOfLastDot = userEntry.lastIndexOf(".");

        String beginning = userEntry.substring(0,indexOfFirstDot);
        String ending = userEntry.substring(indexOfLastDot + 1);
        boolean isValid = beginning.equalsIgnoreCase("www") &&
                ending.equalsIgnoreCase("com") || ending.equalsIgnoreCase("gov") ||
                ending.equalsIgnoreCase("edu");

        if (isValid)
            System.out.println("valid website");
        else
            System.out.println("invalid website");


    }
}

/*
Create a class named WebAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */
