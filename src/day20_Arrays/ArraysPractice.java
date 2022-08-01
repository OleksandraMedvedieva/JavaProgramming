package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers = {10,20,50,70}; // size 4
        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------------------------");

        int[] scores = new int [5];
        scores [0] = 65;
        scores [1] = 85;
        scores [2] = 55;
        scores [3] = 75;
        scores [scores.length -1] = 95;
        System.out.println(Arrays.toString(scores));

        System.out.println("---------------------------------------------------------------");

        String[] month ={ "January" ,"February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                         // index: 0 - 11 (length - 1) ; length 12

        for (int i = 0 ; i <= month.length-1 ; i++) {
            System.out.println(month[i]);
        }

        System.out.println("----------------------------------------------");

        for (int i = month.length-1; i >=0 ; i--) {
            System.out.println(month[i]);
        }






    }
}
