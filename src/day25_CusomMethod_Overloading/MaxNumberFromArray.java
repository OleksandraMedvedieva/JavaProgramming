package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int max = maxNumberFromArray(arr1);
        System.out.println("max = " + max);
    }

    public static int maxNumberFromArray(int[] arr){
        int max = arr[0];
        for (int each : arr) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    public static double maxNumberFromArray(double[] arr){
        double max = arr[0];
        for (double each : arr) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    public static long maxNumberFromArray(long[] arr){
        long max = arr[0];
        for (long each : arr) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    public static short maxNumberFromArray(short[] arr){
        short max = arr[0];
        for (short each : arr) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    public static float maxNumberFromArray(float[] arr){
        float max = arr[0];
        for (float each : arr) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    public static byte maxNumberFromArray(byte[] arr){
        byte max = arr[0];
        for (byte each : arr) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    
}
