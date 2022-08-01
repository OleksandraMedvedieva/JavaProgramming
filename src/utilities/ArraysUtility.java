package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    // prints each Int of an Int array in separate lines
    public static void printEachElement (int[] arr){
        for (int each : arr) {
            System.out.println(each); 
        }
    }

    // prints each Double of a Double array in separate lines
    public static void printEachElement (double[] arr){
        for (double each : arr) {
            System.out.println(each);
        }
    }
    
    // prints each String of a String array in separate lines
    public static void printEachElement (String[] arr){
        for (String each : arr) {
            System.out.println(each);
        }
    }

    // prints each Char of a Char array in separate lines
    public static void printEachElement (char[] arr){
        for (char each : arr) {
            System.out.println(each);
        }
    }

    // returns the maximum number from Int Array
    public static int maxNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // returns the maximum number from Double Array
    public static double maxNumber(double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // returns the minimum number from Int Array
    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    // returns the minimum number from Double Array
    public static double minNumber(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    // checks if the given Int is contained in the given Array. Returns boolean
    public static boolean contains (int[] arr, int element){
        boolean result = false;
        for (int each : arr) {
            if (each == element){
                result= true;
            }
        }
        return result;
    }

    // checks if the given String is contained in the given Array. Returns boolean
    public static boolean contains (String[] arr, String element){
        boolean result = false;
        for (String each : arr) {
            if (each.equals(element)){
                result= true;
            }
        }
        return result;
    }

    // checks if the given Double is contained in the given Array. Returns boolean
    public static boolean contains (double[] arr, double element){
        boolean result = false;
        for (double each : arr) {
            if (each == element){
                result= true;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given Array. Returns boolean
    public static boolean contains (char[] arr, char element){
        boolean result = false;
        for (char each : arr) {
            if (each == element){
                result= true;
            }
        }
        return result;
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

    //  adds a char element to Array and returns a new array
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

    // Returns the frequency of one element from int array
    public static int frequencyOfElement (int[] arr, int element){
        int count = 0 ;
        for (int each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // Returns the frequency of one element from Double array
    public static int frequencyOfElement (double[] arr, double element){
        int count = 0 ;
        for (double each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // Returns the frequency of one element from char array
    public static int frequencyOfElement (char[] arr, char element){
        int count = 0 ;
        for (char each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // Returns the frequency of one element from String array
    public static int frequencyOfElement (String[] arr, String element){
        int count = 0 ;
        for (String each : arr) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

    // Return a new Array with the unique elements from int Array
    public static int[] uniqueElements (int[] arr){
        int[] result = {};
        for (int each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Return a new Array with the unique elements from double Array
    public static double[] uniqueElements (double[] arr){
        double[] result = {};
        for (double each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Return a new Array with the unique elements from char Array
    public static char[] uniqueElements (char[] arr){
        char[] result = {};
        for (char each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // Return a new Array with the unique elements from String Array
    public static String[] uniqueElements (String[] arr){
        String[] result = {};
        for (String each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the index from the int array, returns new array
    public static int[] removeElement (int[] arr, int index){
        if (index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int [arr.length -1] ;
        int j = 0 ;
        for (int i = 0; i< arr.length; i++) {
            if(i  == index) {
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    // removes the index from the double array, returns new array
    public static double[] removeElement (double[] arr, int index){
        if (index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        double[] result = new double [arr.length -1] ;
        int j = 0 ;
        for (int i = 0; i< arr.length; i++) {
            if(i  == index) {
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    // removes the index from the char array, returns new array
    public static char[] removeElement (char[] arr, int index){
        if (index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        char[] result = new char [arr.length -1] ;
        int j = 0 ;
        for (int i = 0; i< arr.length; i++) {
            if(i  == index) {
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    // removes the index from the String array, returns new array
    public static String[] removeElement (String[] arr, int index){
        if (index <0 || index > arr.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        String[] result = new String [arr.length -1] ;
        int j = 0 ;
        for (int i = 0; i< arr.length; i++) {
            if(i  == index) {
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    // merge two int array and returns new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    // merge two double array and returns new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    // merge two char array and returns new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    // merge two String array and returns new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;

    }

    // reverse the given array, returns a new array
    public static int[] reverse(int[] arr){
        int[] result = new int [arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    // reverse the given array, returns a new array
    public static double[] reverse(double[] arr){
        double[] result = new double [arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    // reverse the given array, returns a new array
    public static char[] reverse(char[] arr){
        char[] result = new char [arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    // reverse the given array, returns a new array
    public static String[] reverse(String[] arr){
        String[] result = new String [arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
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

    // swaps the element at index i with the element at index j returns the new array
    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the element at index i with the element at index j returns the new array
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the element at index i with the element at index j returns the new array
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    // swaps the element at index i with the element at index j returns the new array
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
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

    public static ArrayList<Integer> convertArrayToArrayList (int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        return list;
    }








}
