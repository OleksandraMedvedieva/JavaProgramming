package tests;

import java.util.*;

public class Array_UniqueElement {
    public static void main(String[] args) {

        int[] arr= {1,1,1,2,3,3,3,4,5,5,6,6,7,89};


        for (int each : arr) {
            int count =0;
            for (int eachElement : arr) {
                if (each==eachElement){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }

        System.out.println("============================================================");
        Integer[] arr1= {1,1,1,2,3,3,3,4,5,5,6,6,7,89};

        //arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        arr1 = new HashSet<>(Arrays.asList(arr1)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1));


    }
}
