package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Homework_Task6 {
    public static void main(String[] args) {

        //6. Use BiFunction functional interface to:
        //		6.1 Create a fucntion that can returns the common characters of two strings
        //				ex: str1 = "Python"
        //					str2 = "Wooden Spoon"
        //				output: on
        BiFunction<String,String,String> commonChars = (s,p)->{
            String res = "";
            if(s.length()<p.length()){
                String[] arr1 = s.split("");
                for (String each : arr1) {
                    if(p.contains(each)){
                        res+=each;
                    }
                }
            }else{
                String[] arr2 = p.split("");
                for (String each : arr2) {
                    if(s.contains(each)){
                        res+=each;
                    }
                }
            }
            return res;

        };
        String str1 = "Python";
        String str2 = "Wooden Spoon";
        System.out.println("commonChars.apply(str2,str1) = " + commonChars.apply(str2, str1));

        //		6.2 Create a function that can return the common elements of two integer arrays
        BiFunction<int[],int[],String> commonElem = (t,u) ->{
            String res = "";
            if (t.length<u.length){
                for (int each : t) {
                    int count =0;
                    for (int each2 : u) {
                        if(each==each2){
                            count++;
                            res+=each;
                        }
                    }
                }
            }else{

                for (int each : u) {
                    int count =0;
                    for (int each2 : t) {
                        if(each==each2){
                            count++;
                            res+=each;
                        }
                    }
                }
            }
            return res;
        };
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[]  arr2 = {7,8};
        System.out.println("commonElem.apply(arr1,arr2) = " + commonElem.apply(arr1, arr2));

        //		6.3 Create a function that can return the common elements of two String arrays
        BiFunction<String[],String[],String> commonEl2 = (t,u) ->{
            String res="";
            if (t.length<u.length){
                for (String each : t) {
                    for (String each2 : u) {
                        if (each.equals(each2)){
                            res+=each+ " ";
                        }
                    }
                }
            }else{
                for (String each : u) {
                    for (String each2 : t) {
                        if (each.equals(each2)){
                            res+=each+ " ";
                        }
                    }
                }
            }
            return res;
        };
        String[] arr3 ={"Apple","Orange","Lime","Watermelon","Pie"};
        String[] arr4 ={"Apple","Java","Lemon","Watermelon"};
        System.out.println("commonEl2.apply(arr4,arr3) = " + commonEl2.apply(arr4, arr3));

        //		6.4 Create a function that can return the common elements of two Lists of Integers
        BiFunction<List<Integer>,List<Integer>,String> commonEl3 = (p,u)->{
            String res = "";
            if(p.size()< u.size()){
                for (Integer each : p) {
                    for (Integer each2 : u) {
                        if (each==each2){
                            res+=each +" ";
                        }
                    }
                }
            }else{
                for (Integer each : u) {
                    for (Integer each2 : p) {
                        if (each==each2){
                            res+=each +" ";
                        }
                    }
                }
            }
            return res;
        };
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(11,22,3,44,51,6,723,80));
        System.out.println("commonEl3.apply(list1,list2) = " + commonEl3.apply(list1, list2));

        //		6.5 Create a function that can return the common elements of two Lists of Strings
        BiFunction<List<String>,List<String>,String> commonEl4 = (p,u)->{
            String res = "";
            if(p.size()<u.size()){
                for (String each : p) {
                    for (String each2 : u) {
                        if (each.equalsIgnoreCase(each2)){
                            res+=each + " ";
                        }
                    }
                }
            }else{
                for (String each : u) {
                    for (String each2 : p) {
                        if (each.equalsIgnoreCase(each2)){
                            res+=each+ " ";
                        }
                    }
                }
            }
            return res;
        };

        List<String> list3 = new ArrayList<>(Arrays.asList("Apple","Orange","Lime","Watermelon","Pie"));
        List<String> list4 = new ArrayList<>(Arrays.asList("Apple","Java","Lemon","Watermelon"));
        System.out.println("commonEl4.apply(list3,list4) = " + commonEl4.apply(list3, list4));

    }
}
