package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        keyboard.close();
        if (word.startsWith("x")){
            word = word.replaceFirst("x", "a");
            System.out.println(word);
        }else{
            System.out.println("A word doesn't starts with \"x \" ");
        }





    }
}

/*
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
