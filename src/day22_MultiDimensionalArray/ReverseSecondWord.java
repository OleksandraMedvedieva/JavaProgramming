package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String[] arr = sentence.split(" ");
        String result = "";
        for (int i = arr[1].length()-1; i >=0; i--) {
            result+= arr[1].charAt(i);
        }
        //sentence = sentence.replaceFirst(arr[1], result);
        arr[1] = result;
        System.out.println(Arrays.toString(arr));
        for (String each : arr) {
            System.out.print(each+ " ");
        }






    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java

 */
