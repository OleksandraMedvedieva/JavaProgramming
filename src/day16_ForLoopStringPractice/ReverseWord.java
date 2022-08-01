package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        String result = "";
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).nextLine();
        for (int i = word.length() - 1; i >=0 ; i--) {
            result+= word.charAt(i);
        }
        System.out.println("result = " + result);





    }
}

/*
tasks
	1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW


 */
