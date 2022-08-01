package day17_While_DoWHile.day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,7,7};
        arr = removeElement(arr,2);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] removeElement (int[] arr, int index){
        if (index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if (i!= index){
                result = ArraysUtility.addElement(result,arr[i]);
            }
        }
        return result;
    }
}
