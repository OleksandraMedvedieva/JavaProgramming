package day12_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = keyboard.nextLine();

        System.out.println("Enter GPA: ");
        double gpa = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.println("Enter school name:  : ");
        String schoolName = keyboard.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        keyboard.close();

    }


}
