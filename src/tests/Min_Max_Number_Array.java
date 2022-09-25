package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Min_Max_Number_Array {
    public static void main(String[] args) {


        int[] arr= {2,3,67,89,2,34,5,1,0,-89,56,-45,12};
        int min = arr[0];
        int max = arr[0];
        for (int eachElement : arr) {
            if (eachElement<min){
                min = eachElement;
            }
            if (eachElement>max){
                max = eachElement;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("=================================================");
        Arrays.sort(arr);
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[arr.length-1] = " + arr[arr.length - 1]);

        System.out.println("=================================================");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,67,89,2,34,5,1,0,-89,56,-45,12));
        Collections.sort(list);
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(list.size()-1) = " + list.get(list.size() - 1));


    }
}
