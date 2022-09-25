package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {

        String str = "baklava";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        System.out.println("list = " + list);

        char [] arr = {'A','B'};
        String res = new String (arr);
        System.out.println(res);


    }
}
