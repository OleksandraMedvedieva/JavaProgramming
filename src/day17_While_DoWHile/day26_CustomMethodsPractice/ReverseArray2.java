package day17_While_DoWHile.day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,7,7};
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] reverse (int[] arr){
        int[] result = {};
        for (int i = arr.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,arr[i]);
        }
        return result;
    }
}
