package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1= "soos";
        String str2= "ooss";
        char[] arrayStr1 = str1.toCharArray();
        char[] arrayStr2 = str2.toCharArray();
        Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);
        if (Arrays.equals(arrayStr1,arrayStr2)){
            System.out.println(true);
        }

    }
}
