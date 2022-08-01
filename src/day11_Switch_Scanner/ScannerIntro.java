package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.println("Enter a decimal: ");
        double num2 = input.nextDouble();
        System.out.println("integer = " + num2);
        System.out.println("decimal = " + num1);
        System.out.println("Multiplication: "+ (num1*num2));
        input.close(); // close tha Scanner. After this you cn not use Scanner anymore


    }

}
