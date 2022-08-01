package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClassExamples {
    public static void main(String[] args) {

        int i1 = 100; // primitive
        Integer i2;   // object like Scanner scan = new Scanner;

        // auto-boxing example
        i2 = i1;      // automatically enlarge from primitive to object

        ArrayList<Integer> list = new ArrayList<>();
        list.add(i1);   // automatically enlarge from primitive to object  // auto-boxing example
        list.add(i2);
        System.out.println("----ArrayList------");
        System.out.println(list);

        // un-boxing example

        Integer n1 = 300;
        int n2 = n1; // un-boxing object to primitive
        n2 = list.get(1);  // getting an object from arraylist and assign to primitive = un boxing
        System.out.println("n2 = " + n2);

        System.out.println("------------------------------------------------------");
        String searchResult = "1-48 of over 6000 results for java";

        String[] arr = searchResult.split(" ");
        System.out.println(Arrays.toString(arr));
        int resultAsPrimitive = Integer.parseInt(arr[3]);
        System.out.println("resultAsPrimitive = " + resultAsPrimitive);

        Integer resultAsObject = Integer.valueOf(arr[3]);
        System.out.println("resultAsObject = " + resultAsObject);





    }
}
