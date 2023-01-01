package day28_ArrayList.day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        arr = replaceAll(arr, 30, 300);
        System.out.println(Arrays.toString(arr));

    }
    //replaces all the element of the array that matching with the given old element with the given new element,returns the new array.
    public static int[] replaceAll(int[] arr, int oldElement, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    //replaces all the element of the array that matching with the given old element with the given new element,returns the new array.
    public static double[] replaceAll(double[] arr, double oldElement, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    //replaces all the element of the array that matching with the given old element with the given new element,returns the new array.
    public static char[] replaceAll(char[] arr, char oldElement, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    //replaces all the element of the array that matching with the given old element with the given new element,returns the new array.
    public static String[] replaceAll(String[] arr, String oldElement, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldElement)){
                arr[i] = newElement;
            }
        }
        return arr;
    }
}

/*
2. RecplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement.
		The method replaces all the element of the array that matching with the given old element with the given new element,
		and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}
		2.2 Create the same functions for double arrays, char arrays, and String arrays

 */
