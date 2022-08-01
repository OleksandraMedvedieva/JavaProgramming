package day25_CusomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7};
        ArraysUtility.printEachElement(arr1);
        System.out.println("------------------------------------");

        double[] arr2 ={1.2,4.5,6.7,8.9};
        ArraysUtility.printEachElement(arr2);
        System.out.println("------------------------------------");

        char[] arr3 = {'a','s','s','w','q','b','n'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("------------------------------------");

        String[] arr4 = {"Sasha", "Sofia", "Victoria", "Olena"};
        ArraysUtility.printEachElement(arr4);
        System.out.println("------------------------------------");

        int[] arr5 = {11,211,31,4,51,623,7};
        int max = ArraysUtility.maxNumber(arr5);
        System.out.println("max = " + max);
        int min = ArraysUtility.minNumber(arr5);
        System.out.println("min = " + min);

        System.out.println("------------------------------------");

        double[] arr6 = {11.7,21.1,3.1,4,5.1,6.3,7};
        double max2 = ArraysUtility.maxNumber(arr6);
        System.out.println("max2 = " + max2);
        double min2 = ArraysUtility.minNumber(arr6);
        System.out.println("min2 = " + min2);

        System.out.println("------------------------------------");
        int[] a1 = {11,211,31,4,51,623,7};
        boolean r1= ArraysUtility.contains(a1,11);
        System.out.println("r1 = " + r1);

        System.out.println("------------------------------------");
        double[] a2 = {11.7,21.1,3.1,4,5.1,6.3,7};
        boolean r2= ArraysUtility.contains(a2,7);
        System.out.println("r2 = " + r2);

        System.out.println("------------------------------------");
        String[] a3 = {"Sasha", "Sofia", "Victoria", "Olena"};
        boolean r3= ArraysUtility.contains(a3, "Olha");
        System.out.println("r3 = " + r3);


    }
}
