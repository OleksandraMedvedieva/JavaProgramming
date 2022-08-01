package day17_While_DoWHile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        while ( !(age>=1 && age<=120)){
            System.err.println("Invalid age. Please re-enter:");
            System.err.println("Enter your age:");
            age = scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next();
        while ( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
            System.err.println("Invalid answer. Please re-enter:");
            System.err.println("Are you a US citizen? yes/no");
            answer = scan.next();
        }

        if (age >= 18 && answer.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote.");
        }




    }
}
