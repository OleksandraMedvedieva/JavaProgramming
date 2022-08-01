package day15_ForLoop;

import java.util.Scanner;

public class FirstLastName {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a first name");
        String firstName = keyboard.next();
        System.out.println("Enter a last name");
        String lastName = keyboard.next();
        keyboard.close();
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

 // (firstName.charAt (0) + "").toUpperCase()

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);

    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */