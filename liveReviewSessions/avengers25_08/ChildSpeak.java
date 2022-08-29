package avengers25_08;

import java.util.ArrayList;
import java.util.Arrays;

public class ChildSpeak {
    public static void main(String[] args) {

        String word = "island";
        String[] wordArr = word.split("");
        String firstConsonant = firstConsonant(wordArr);

        //        System.out.println(Arrays.toString(wordArray));
//
//        for(int i=0; i<wordArray.length; i++){
//            if(isConsonant(wordArray[i]))
//            System.out.println(wordArray[i]+" consonant");
//            else if(isVowel(wordArray[i]))
//                System.out.println(wordArray[i]+" vowel");
        ArrayList<String> outputWordList = new ArrayList<>(Arrays.asList(wordArr));
        outputWordList = replaceAllConsonant(outputWordList,firstConsonant);
        System.out.println(outputWordList);


    }

    public static boolean isConsonant(String s) {
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

        for (int i = 0; i < consonants.length; i++) {
            if (s.equals(consonants[i])) return true;
        }
        return false;
    }

    public static boolean IsVowel(String s) {
        String[] vowels = {"a", "e", "i", "o", "u", "y"};

        for (int i = 0; i < vowels.length; i++) {
            if (s.equals(vowels[i])) return true;
        }
        return false;
    }

    public static String firstConsonant(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(isConsonant(arr[i]))
                return arr[i];
        }
        return null;
    }

    public static ArrayList<String> replaceAllConsonant(ArrayList<String> list, String first){
        for (int i = 0; i < list.size(); i++) {
            if(isConsonant(list.get(i))){
                list.set(i,first);
            }
        }
        return list;

    }

    


}
/*
island  : issass
Rule 1: Turn all consonants into first consonant
{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"} - consonant
{"a", "e", "i", "o", "u", "y"} - vowel

Rule 2: if the first character is a vowel, then put the first consonant at the beginning

island  : issass : sissass


// create a static method that takes a string as parameter
 */
