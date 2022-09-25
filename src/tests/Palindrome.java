package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "anna";
        String result ="";
        /*
        for (int i = str.length()-1; i >=0; i--){
            result+=str.charAt(i);
        }
        if(result.equalsIgnoreCase(str)){
            System.out.println("res = " + true);
        }else{
            System.out.println("res = " + false);
        }

         */
        String[] arr = {"H","e","l","l","o"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList("H","e","l","l","o"));

        String str = String.join("",arr);
        System.out.println("str = " + str);

        String str2 = String.join("",list);
        System.out.println("str2 = " + str2);

    }
}
