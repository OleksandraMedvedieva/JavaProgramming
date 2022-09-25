package day53_FunctionalInterface;

import day42_Exceptions.animalTask.Flyable;

import java.util.*;
import java.util.function.Function;

public class Homework_Task4 {
    public static void main(String[] args) {
        //4. Use Function functional interface to:
        //		4.1 Create a function that can return the sum of digits from a string
        Function<String,Integer> sumOfDigits = p->{
            char[] arr=p.toCharArray();
            int res = 0 ;
            for (char each : arr) {
                if(Character.isDigit(each)){
                    res+=Integer.parseInt(each+"");
                }
            }
            return res;
        };
        System.out.println("sumOfDigits.apply(\"sasha12sslls23\") = " + sumOfDigits.apply("sasha12sslls23"));


        //		4.2 Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>, List<Integer>> convertSetToList = p->{
            List<Integer> list = new ArrayList<>();
            for (Integer each : p) {
                list.add(each);
            }
            return list;
        };
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("convertSetToList.apply(set1) = " + convertSetToList.apply(set1));

        //		4.3 Create a function that can convert a Set of String to List of String
        Function<Set<String>, List<String>> convertSetToList2 = p->{
            List<String> list = new ArrayList<>();
            for (String each : p) {
                list.add(each);
            }
            return list;
        };
        Set<String> set2 = new HashSet<>(Arrays.asList("Apple","Orange","Lime","Watermelon","Pie"));
        System.out.println("convertSetToList2.apply(set2) = " + convertSetToList2.apply(set2));

        //		4.4 Create a function that can return the reversed version of an int array
        Function<int[], int[]> reverseArr= p->{
            int[] res = new int[p.length];
            for (int i = p.length - 1, j=0; i >= 0; i--,j++) {
                res[j] = p[i];
            }
            return res;
        };

        int[] arr = {12,23,45,65,76,34,12,97,123,-98,0,56};
        System.out.println(Arrays.toString(reverseArr.apply(arr)) );

        //		4.5 Create a function that can return the reversed version of a String array
        Function<String[],String[]> reverseArr2 = a->{
            String[] res = new String[a.length];
            int j =0;
            for (int i = a.length - 1; i >= 0; i--) {
                res[j++] = a[i];
            }
            return res;
        };
        String[] arr2 ={"Apple","Orange","Lime","Watermelon","Pie"};
        System.out.println(Arrays.toString(reverseArr2.apply(arr2)) );

        //		4.6 Create a function that can return the sorted (decending) version of an int array
        //				Note: you can use the reverse function you created at 4.4
        Function<int[],int[]> sortArr = p->{
           Arrays.sort(p);
           int[] res = new int[p.length];
            for (int i = p.length - 1,j=0; i >= 0; i--) {
              res[j++]  = p[i];
            }
            return res;

        };

        int[] arr3 = {12,23,45,65,76,34,12,97,123,-98,0,56};
        System.out.println(Arrays.toString(sortArr.apply(arr3)) );

        //		4.7 Create a function that can return the sorted (decending) version of a String array
        //				Note: you can use the reverse function you created at 4.5

        Function< String[], String[]> sortArr2 = p->{
            String [] res = new String[p.length];
            Arrays.sort(p);
            for (int i = p.length - 1,j=0; i >= 0; i--) {
                res[j++]  = p[i];
            }
            return res;
        };

        String[] arr4 ={"Apple","Orange","Lime","Watermelon","Pie"};
        System.out.println(Arrays.toString(sortArr2.apply(arr4)) );





    }
}
