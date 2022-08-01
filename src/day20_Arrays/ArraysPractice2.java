package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26]; // A-Z

/*
        for (int i = 0, j = 'A'; i < letters.length; i++, j++) {  // i - index numbers from 0 - to the last index
             letters[i] = (char)j;
        }

 */
        char ch = 'A';
        for (int i = 0; i < letters.length ; i++) {
            letters[i] = ch++;
        }

        System.out.println(Arrays.toString(letters));
        System.out.println("--------------------------------------------------------------");

        char[] letters2 = new char[26]; // Z-A
        for (int i = 0, j = 'Z'; i <letters2.length; i++, j--) {  // i - index numbers from 0 - to the last index
            letters2[i] = (char)j;

        }
        System.out.println(Arrays.toString(letters2));



    }
}
