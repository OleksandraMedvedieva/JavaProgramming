package tests;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arr_RemoveDuplicates {
    public static void main(String[] args) {
        /*int[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        int[] result = {};
        int i =0;

        for (int eachNum : nums) {
           if(!contains(result,eachNum)) {
               result[i++] =eachNum;
           }
        }
        System.out.println(Arrays.toString(result));

    }

    public static boolean contains (int[] arr, int element){
        boolean result = false;
        for (int each : arr) {
            if (each == element){
                result= true;
            }
        }
        return result;
    }
    public static int[] removeDuplicates (int[] arr){
        int[] result = {};
        for (int each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }*/
        int [] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3};

        /*1)
        Set<Integer> res = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println("res = " + res);
         */
        /*2)
        nums = Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.toString(nums));
         */



    }
}
