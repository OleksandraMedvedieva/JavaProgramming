package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] arr = {10,20,2,3,4,67};
        arr = replace(arr,0,109);
        System.out.println(Arrays.toString(arr));
        String[] arr2 = {"A","A","A","A","A","A"};
        arr2 = replace(arr2,4,"Cool");
        System.out.println(Arrays.toString(arr2));
    }
    // replaces the element of the array at given index with the new element, and returns the new array
    public static int[] replace (int[] arr, int index, int newElement){
        if (index<0 || index> arr.length-1){
            System.err.println("invalid index: " + index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array
    public static double[] replace (double[] arr, int index, double newElement){
        if (index<0 || index> arr.length-1){
            System.err.println("invalid index: " + index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array
    public static char[] replace (char[] arr, int index, char newElement){
        if (index<0 || index> arr.length-1){
            System.err.println("invalid index: " + index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array
    public static String[] replace (String[] arr, int index, String newElement){
        if (index<0 || index> arr.length-1){
            System.err.println("invalid index: " + index);
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;
    }
}

/*

warmup tasks:
	1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
		The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays
 */
