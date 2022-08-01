package day22_MultiDimensionalArray;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        String[] arr = sentence.split(" ");
        String result = "";

        for (int i = arr.length-1; i >=0; i--) {
            result += arr[i] + " ";
        }
        System.out.println(result);



    }
}

/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */
