package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int[] intArray ={5,6,7,0,9,8};
        Arrays.sort(intArray);
        double[] doubleArray = {106.4,56.9,7.5,89.3,67.8};
        Arrays.sort(doubleArray);
        char[] charArray = {'K','B','C','E','Q',};
        Arrays.sort(charArray);
        System.out.println("------------------------------------------------------------");
        sumOfNumbers(23.4,67);



    }

    public static int sumOfNumbers (int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers (double num1, double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers (double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers (int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    public static double sumOfNumbers (double num1, double num2, double num3, double num4){
        return sumOfNumbers(num1,num2,num3)+ num4;
    }
}
