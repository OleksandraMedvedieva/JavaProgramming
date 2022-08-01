package day25_CusomMethod_Overloading.day27_WrapperClasses;

import java.util.Arrays;

public class InsertTask {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = insert(arr,2,100);
        System.out.println(Arrays.toString(result));
    }

    public static int[] insert (int[] arr, int index, int element){

        if(index < 0 || index >= arr.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result = new int[arr.length + 1];
        result[index] = element;
        for (int i = 0, j=0; i < arr.length; i++, j++) {
            if (i == index){
                j++;
            }
            result[j] = arr[i];
        }
        return result;
    }

    public static double[] insert (double[] arr, int index, double element){

        if(index < 0 || index >= arr.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double[] result = new double[arr.length + 1];
        result[index] = element;
        for (int i = 0, j=0; i < arr.length; i++, j++) {
            if (i == index){
                j++;
            }
            result[j] = arr[i];
        }
        return result;
    }

    public static char[] insert (char[] arr, int index, char element){

        if(index < 0 || index >= arr.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        char[] result = new char[arr.length + 1];
        result[index] = element;
        for (int i = 0, j=0; i < arr.length; i++, j++) {
            if (i == index){
                j++;
            }
            result[j] = arr[i];
        }
        return result;
    }

    public static String[] insert (String[] arr, int index, String element){

        if(index < 0 || index >= arr.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result = new String[arr.length + 1];
        result[index] = element;
        for (int i = 0, j=0; i < arr.length; i++, j++) {
            if (i == index){
                j++;
            }
            result[j] = arr[i];
        }
        return result;
    }

}

/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters:
		integer array, integer index, integer element.
		the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */
