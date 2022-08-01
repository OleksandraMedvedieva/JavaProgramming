package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;

        int subtraction1 = num1/num2;
        int remainder = num1 % num2;

        System.out.println("subtraction1 = " + subtraction1);
        double subtraction2 = (double)num1/num2;
        System.out.println("subtraction2 = " + subtraction2);
        System.out.println(num1 + " divide by " + num2 + " is equal to " + subtraction1 + " with a remainder of " + remainder);
        System.out.println(1 % 3);
        System.out.println(25 % 5);
    }
}
