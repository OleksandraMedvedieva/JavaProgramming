package week09;

import java.util.Arrays;

public class RemoveSpaces2 {
    public static void main(String[] args) {

        String word = "  Hello world      I      love      Java    ";
        String[] s  = word.trim().split(" ");
        System.out.println(Arrays.deepToString(s));

        String result = "";
        for (String each : s){
            if (!each.isBlank()){
                result+=each + " ";
            }
        }
        System.out.println(result);


    }

}

/*
   Task 3 :    Write a method that can remove  all extra space from String


                 Input: "  Hello world      I      love      Java    "
                 Output: Hello world I love Java

 */
