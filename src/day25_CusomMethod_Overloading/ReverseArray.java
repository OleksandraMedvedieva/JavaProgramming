package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] reverse = reverseArray(arr1);
        System.out.println(Arrays.toString(reverse));
        String[] arr3 = {"One", "Two", "Three"};
        arr3 = reverseArray(arr3);
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] reverseArray(int[] arr){
        int[] result = new int[arr.length];
        for (int i = arr.length-1, j = 0; i>=0; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }

    public static double[] reverseArray(double[] arr){
        double[] result = new double[arr.length];
        for (int i = arr.length-1, j = 0; i>=0; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }

    public static char[] reverseArray(char[] arr){
        char[] result = new char[arr.length];
        for (int i = arr.length-1, j = 0; i>=0; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }

    public static String[] reverseArray(String[] arr){
        String[] result = new String[arr.length];
        for (int i = arr.length-1, j = 0; i>=0; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }
}
