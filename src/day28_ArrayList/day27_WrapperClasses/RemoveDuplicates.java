package day28_ArrayList.day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        String[] arr2 = {"A","A","A","A","B","A"};
        arr2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    // remove duplicates from the given array and return new array
    public static int[] removeDuplicates (int[] arr){
        int[] result = {};
        for (int each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // remove duplicates from the given array and return new array
    public static double[] removeDuplicates (double[] arr){
        double[] result = {};
        for (double each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // remove duplicates from the given array and return new array
    public static char[] removeDuplicates (char[] arr){
        char[] result = {};
        for (char each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // remove duplicates from the given array and return new array
    public static String[] removeDuplicates (String[] arr){
        String[] result = {};
        for (String each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
