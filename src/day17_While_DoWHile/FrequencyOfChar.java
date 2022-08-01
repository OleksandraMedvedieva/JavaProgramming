package day17_While_DoWHile;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aaaabbbc";
        char ch = 'a';
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                ++result;
            }
        }
        System.out.println(result);

    }
}



/*
warmup tasks:
	1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */