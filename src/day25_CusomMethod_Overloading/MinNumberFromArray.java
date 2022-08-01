package day25_CusomMethod_Overloading;

public class MinNumberFromArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int min = minNumberFromArray(arr1);
        System.out.println("min = " + min);
       
    }

    public static int minNumberFromArray(int[] arr){
        int min = arr[0];
        for (int each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }

    public static double minNumberFromArray(double[] arr){
        double min = arr[0];
        for (double each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }

    public static long minNumberFromArray(long[] arr){
        long min = arr[0];
        for (long each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }

    public static short minNumberFromArray(short[] arr){
        short min = arr[0];
        for (short each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }

    public static float minNumberFromArray(float[] arr){
        float min = arr[0];
        for (float each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }

    public static byte minNumberFromArray(byte[] arr){
        byte min = arr[0];
        for (byte each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;
    }



}
