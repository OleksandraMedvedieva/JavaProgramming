package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { // outer loop

            System.out.println("Enter 1st number: ");
            int num1 = input.nextInt();
            System.out.println("Enter 2nd number: ");
            int num2 = input.nextInt();
            System.out.println("Addition: " + (num1 + num2));



            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();

            while ( !((a.equals("no")) || a.equals("yes"))){ // inner loop
                System.out.println("Invalid answer, re-enter");
                a = input.next().toLowerCase();

            }
            if (a.equals("no")){ // exit the outer loop
                break;
            }

        }
    }
}
