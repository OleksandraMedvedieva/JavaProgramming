package day15_ForLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber = 2147483647;
        int inputNumber = 0;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("enter number");
            inputNumber = input.nextInt();
            if (inputNumber < minNumber){
                minNumber = inputNumber;
            }
        }
        System.out.println("minNumber = " + minNumber);





    }
}
