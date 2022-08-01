package week09;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";
        System.out.println(removeExtraSpaces(str));

    }

    public static String removeExtraSpaces(String input){
        String[] s = input.trim().split(" ");
        //System.out.println(Arrays.toString(s));
        String result = "";
        for (String each : s){
            if (!each.isEmpty()){
                result+=each + " ";
            }
        }
        return result;
    }

}
/*
Task 3 :    Write a method that can remove  all extra space from String


                 Input: "  Hello world      I      love      Java    "
                 Output: Hello world I love Java
 */
