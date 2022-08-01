package week09;

import java.util.Arrays;

public class CombinationOfTwoArrays {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8,9,10};
        int[] result = new int [array1.length+ array2.length];
        int i = 0;
        for (int each : array1) {
            result[i++] = each;
        }
        for (int each : array2) {
            result[i++] = each;
        }
        System.out.println(Arrays.toString(result));

    }
}

/*
    Task 2 :   Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
