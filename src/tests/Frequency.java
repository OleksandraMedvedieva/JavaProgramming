package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {
    public static void main(String[] args) {

        String str = "java java python ruby c++ c++ java hello";
        String word = "java";
        int count =0;
        /*
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (String each : list) {
            if (each.equalsIgnoreCase(word)){
                count++;
            }
        }

         */
        /*
        str = str.toLowerCase();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        word = word.toLowerCase();
        count = Collections.frequency(list,word);
        System.out.println("count = " + count);

         */
        /*
        str = str.toLowerCase();
        word = word.toLowerCase();
        while (str.contains(word)){
            str = str.replaceFirst(word,"");
            count++;
        }
        System.out.println("count = " + count);

         */


    }
}
