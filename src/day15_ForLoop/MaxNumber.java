package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber = -2147483648;
        int inputNumber = 0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Enter number:");
            inputNumber = input.nextInt();
            if (input.nextInt() > maxNumber){
                maxNumber = inputNumber;
            }

        }
        System.out.println("maxNumber = " + maxNumber);




    }
}
