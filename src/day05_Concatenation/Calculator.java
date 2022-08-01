package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
         int first_number = 100;
         int second_number = 65;
         int addition = first_number + second_number;
         int subtraction = first_number - second_number;
         int multiplication = first_number * second_number;

         System.out.println(first_number + " + " + second_number + " = " + addition);
         System.out.println(first_number + " + " + second_number + " = " + (first_number + second_number));

         System.out.println(first_number + " - " + second_number + " = " + subtraction);
         System.out.println(first_number + " * " + second_number + " = " + multiplication);


    }
}
