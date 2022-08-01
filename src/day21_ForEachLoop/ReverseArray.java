package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};
        int[] result = new int[numbers.length];

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            result[j] = numbers[i];
        }
        System.out.println(Arrays.toString(result));


    }
}
