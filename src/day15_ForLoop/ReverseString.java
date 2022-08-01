package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
        String result = "";
        for (int i=(word.length() - 1); i>=0; i--)
            result+= word.charAt(i);

        System.out.println("result = " + result);

        }





    }


/*
Tasks:
	1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123

 */
