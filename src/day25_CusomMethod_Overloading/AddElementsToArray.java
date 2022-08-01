package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        arr = addInteger(arr,5);
        System.out.println(Arrays.toString(arr));
        double[] arr2 = {1.5,2.5,3.5,4.5};
        arr2 = addDouble(arr2,5.5);
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = {"One", "Two", "Three"};
        arr3 = addString(arr3,"Four");
        System.out.println(Arrays.toString(arr3));
        char[] arr4 = {'#', '4', '$', '&'};
        arr4 = addChar(arr4,'%');
        System.out.println(Arrays.toString(arr4));



    }

    public static int[] addInteger (int [] array, int element){

        int[] result = new int[array.length +1];
        int i = 0;
        for (int each : array) {
            result[i] =each;
            i++;
        }
        result[i] = element;
        return result;
    }

    public static double[] addDouble (double [] array, double element){

        double[] result = new double[array.length +1];
        int i = 0;
        for (double each : array) {
            result[i] =each;
            i++;
        }
        result[i] = element;
        return result;
    }

    public static String[] addString (String [] array, String element){

        String[] result = new String[array.length +1];
        int i = 0;
        for (String each : array) {
            result[i] =each;
            i++;
        }
        result[i] = element;
        return result;
    }

    public static char[] addChar (char [] array, char element){

        char[] result = new char[array.length +1];
        int i = 0;
        for (char each : array) {
            result[i] =each;
            i++;
        }
        result[i] = element;
        return result;
    }


}
/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */
