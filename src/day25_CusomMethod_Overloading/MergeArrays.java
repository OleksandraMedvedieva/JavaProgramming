package day25_CusomMethod_Overloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        int[] merge = mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(merge));

    }

    public static int[] mergeArrays (int[] arr1, int[] arr2){
        int[] result = new int [arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    public static double[] mergeArrays (double[] arr1, double[] arr2){
        double[] result = new double [arr1.length + arr2.length];
        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    public static char[] mergeArrays (char[] arr1, char[] arr2){
        char[] result = new char [arr1.length + arr2.length];
        int i = 0;
        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    public static String[] mergeArrays (String[] arr1, String[] arr2){
        String[] result = new String [arr1.length + arr2.length];
        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }

}
