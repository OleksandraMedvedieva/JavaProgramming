package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        System.out.println("sum = " + sum);

        System.out.println("==========================================================================");
        Scanner input = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <=5; i++) {
            System.out.println("enter " + i + " number:");
            total += input.nextInt();
        }
        System.out.println("total = " + total);

input.close();
    }
}
/*
   3. Write a program that can calculate the sum of all integers between 1 to 100



 */
