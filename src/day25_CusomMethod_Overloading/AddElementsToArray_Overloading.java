package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        numbers = addElement(numbers,7);
        System.out.println(Arrays.toString(numbers));
        char[] chars = {'#', '4', '$', '&'};
        chars = addElement(chars, 'E');
        System.out.println(Arrays.toString(chars));
        String[] str = {"One", "Two", "Three"};
        str = addElement(str,"Four");
        System.out.println(Arrays.toString(str));

    }
    //  adds an Integer element to Array and returns a new array
    public static int[] addElement (int [] array, int element){

        int[] result = new int[array.length +1];
        int i = 0;
        for (int each : array) {
            result[i] =each;
            i++;
        }
        result[i] = element;
        return result;
    }
    //  adds a Double element to Array and returns a new array
    public static double[] addElement (double [] array, double element){

        double[] result = new double[array.length +1];
        int i = 0;
        for (double each : array) {
            result[i] =each;
            i++;
        }
        result[i] = element;
        return result;
    }
    //  adds a String element to Array and returns a new array
    public static String[] addElement (String [] array, String element){

        String[] result = new String[array.length +1];
        int i = 0;
        for (String each : array) {
            result[i] =each;
            i++;
        }
        result[i] = element;
        return result;
    }
    // //  adds a char element to Array and returns a new array
    public static char[] addElement (char [] array, char element){

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
