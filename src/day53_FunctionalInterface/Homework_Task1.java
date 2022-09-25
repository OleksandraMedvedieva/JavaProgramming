package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework_Task1 {
    public static void main(String[] args) {

        //1.1 Create a function that can return the maximum number from a list of Integer
      ListFunction<List<Integer>,Integer> maxNum = l ->{
          return Collections.max(l);
      };

      List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("maxNum.apply(list) = " + maxNum.apply(list));

        //1.2 Create a function that can return the minimum number from a list of Integer
        ListFunction<List<Integer>,Integer> minNum = l ->{
            return Collections.min(l);
        };
        System.out.println("minNum.apply(list) = " + minNum.apply(list));

        //	1.3 Create a function that can return the longest String from a List of String
        ListFunction<List<String>,String> longestStr = s-> {
            int maxL = 0;
            String res = "";
            for (String each : s) {
                if (each.length()>maxL){
                    maxL= each.length();
                    res = each;
                }
            }
            return res;
        };

        List<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C++","Rybu"));
        System.out.println("longestStr.apply(list2) = " + longestStr.apply(list2));

        //1.4 Create a function that can return the shortest String from a List of String

        ListFunction<List<String>,String> shortestStr = s-> {
            int mimL = Integer.MAX_VALUE;
            String res = "";
            for (String each : s) {
                if (each.length()<mimL){
                    mimL= each.length();
                    res = each;
                }
            }
            return res;
        };
        System.out.println("shortestStr.apply(list2) = " + shortestStr.apply(list2));

        //1.5 Create a function that can convert List of integer to int array
        ListFunction<List<Integer>,int[]> convertListToArr = c ->{
            int[] res = new int[c.size()];
            int i=0;
            for (Integer each : c) {
                res[i++] =each;
            }
            return res;
        };
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int [] arr = convertListToArr.apply(list3);
        System.out.println(Arrays.toString(arr));

        //1.6 Create a function that can convert List of double to double array

        ListFunction<List<Double>,double[]> convertListToArr2 = c ->{
            double[] res = new double[c.size()];
            int i=0;
            for (Double each : c) {
                res[i++] =each;
            }
            return res;
        };

        List<Double> list4 = new ArrayList<>(Arrays.asList(1.3,2.4,3.8,4.9));
        double [] arr2 = convertListToArr2.apply(list4);
        System.out.println(Arrays.toString(arr2));


    }
}

/*

1. Create a functional interface named ListFunction that contains the following abstract method:

		R apply(List<T>  list);

	Use ListFunction functional interface to:
		1.1 Create a function that can return the maximum number from a list of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array
 */
