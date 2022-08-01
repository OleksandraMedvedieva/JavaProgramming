package day17_While_DoWHile.day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,4,5,5,7,7};
        int[] unique = uniqueElements(arr);
        System.out.println(Arrays.toString(unique));
        double[] arr2 = {1.2,4.5,1.2,4.5,1.7,3.4};
        arr2 = uniqueElements(arr2);
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = {"a", "v","f","a","a","a"};
        arr3 = uniqueElements(arr3);
        System.out.println(Arrays.toString(arr3));


    }

    // Return a new Array with the unique elements from int Array
    public static int[] uniqueElements (int[] arr){
        int[] result = {};
        for (int each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Return a new Array with the unique elements from double Array
    public static double[] uniqueElements (double[] arr){
        double[] result = {};
        for (double each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Return a new Array with the unique elements from char Array
    public static char[] uniqueElements (char[] arr){
        char[] result = {};
        for (char each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Return a new Array with the unique elements from String Array
    public static String[] uniqueElements (String[] arr){
        String[] result = {};
        for (String each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
