package day18_NestedLoop;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to enter another number?");
            String a = input.next().toLowerCase();

            while ( !(a.equals("no") || a.equals("yes"))  ){
                System.err.println("Invalid answer. Pleas, re-enter: ");
                System.out.println("Would you like to enter another number? yes/no");
                a = input.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }
        }


    }
}

/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */
