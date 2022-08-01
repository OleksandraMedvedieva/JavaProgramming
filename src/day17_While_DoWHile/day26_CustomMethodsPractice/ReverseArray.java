package day17_While_DoWHile.day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // reverse the given array, returns a new array
    public static int[] reverse(int[] arr){
        int[] result = new int [arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

}
