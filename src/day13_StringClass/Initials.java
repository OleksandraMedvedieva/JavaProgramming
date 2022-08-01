package day13_StringClass;

import java.util.Arrays;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname = input.next();

        System.out.println("Enter last name");
        String lastname = input.next();
        System.out.println(firstname.charAt(0) + "." + lastname.charAt(0) + ".");
        input.close();

    }
}

/*
Task:
	initial:
		firstName = "Wooden";
		lastName = "Spoon";

	output:
		W.S

 */
