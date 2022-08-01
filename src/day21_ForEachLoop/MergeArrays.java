package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] result = new int[arr1.length + arr2.length];

        int i =0;//index in result
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        System.out.println(Arrays.toString(result));


        System.out.println("------------------------------------------------");
        char[] ch1= {'A', 'B', 'C'};
        char[] ch2= {'A', 'B', 'C'};
        char[] result1 = new char[ch1.length+ ch2.length];

        int j=0;

        for (char c : ch1) {
            result1[j++] = c;
        }
        for (char c : ch2) {
            result1[j++] = c;
        }
        System.out.println(Arrays.toString(result1));

    }
}

/*
Task
  1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */
