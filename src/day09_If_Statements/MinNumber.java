package day09_If_Statements;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 140,
                n2 = 140;
        boolean minimum_number = n1 < n2;
        boolean maximum_number = n1 > n2;
        boolean equal = n1 == n2;

        if (minimum_number){
            System.out.println(n1 + " is the minimum number");
        }
        if (maximum_number){
            System.out.println(n2 + " is the minimum number");
        }
        if (equal){
            System.out.println(n2 + " and " + n2 + " are equal numbers");
        }




    }



}
/*
Warmup tasks:
	1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */
