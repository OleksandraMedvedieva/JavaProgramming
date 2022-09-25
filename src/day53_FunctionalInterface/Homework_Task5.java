package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Homework_Task5 {
    public static void main(String[] args) {

        //5. Use BiPredicate functional interface to:
        //		5.1 Create a function that can check if two array are equal and contains the same elemnts
        //				ex: arr1 = {3,2,1}
        //					arr2 = {2,1,3}
        //				output: true
        BiPredicate<int[],int[]> equalityOfArr = (p,u)->{
            Arrays.sort(p);
            Arrays.sort(u);
            return Arrays.equals(p,u);
        };
        int[] arr1 = {3,2,1};
        int[] arr2 = {2,1,3};
        System.out.println("equalityOfArr.test(arr2,arr1) = " + equalityOfArr.test(arr2, arr1));

        //		5.2 Create a function that can check if the first array contains all the elemnts of the second array:
        //				ex: arr1 = {1,2,3,4,5,6}
        //					arr2 = {7,8}
        //				output: false
        BiPredicate<int[],int[]> contains = (p,u)->{
            boolean result = true;
            if(p.length< u.length){
                for (int each : p) {
                    int frequency =0;
                    for (int each2 : u) {
                        if (each==each2){
                            frequency++;
                        }
                    }
                    if (frequency==0){
                        result = false;
                        break;
                    }
                }
            }else{
                for (int each : u) {
                    int frequency =0;
                    for (int each2 : p) {
                        if (each==each2){
                            frequency++;
                        }
                    }
                    if (frequency==0){
                        result = false;
                        break;
                    }

                }
            }
            return  result;
        };
        int[] arr4 = {1,2,3,4,5,6,7,8};
        int[]  arr5 = {7,8};
        System.out.println("contains.test(arr5,arr4) = " + contains.test(arr5, arr4));

        //		5.3 Create a function that can check if two List of Integers are equal and contains the same elemnts
        //				ex: list1 = {3,2,1}
        //					list2 = {2,1,3}
        //				output: true

        BiPredicate<List<Integer>,List<Integer>> listsEquality = (p,u)->{
             boolean res = true;
                for (Integer eachElem : p) {
                    if (!u.contains(eachElem)){
                        res = false;
                        break;
                    }
            }
                return res;
        };
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(3,2,6));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(2,1,3));
        System.out.println("listsEquality.test(list1,list2) = " + listsEquality.test(list1, list2));

        //		5.4 Create a function that can check if the first List contains all the elemnts of the second List:
        //				ex: list1 = {1,2,3,4,5,6}
        //					list2 = {7,8}
        //				output: false
        BiPredicate<List<Integer>,List<Integer>> contains2 = (p,u)->{
            boolean res = true;
            if(p.size()<u.size()){
                for (Integer each : p) {
                    if(!u.contains(each)){
                        res=false;
                        break;
                    }
                }
            }else{
                for (Integer each : u) {
                    if(!p.contains(each)){
                        res=false;
                        break;
                    }
                }
            }
            return res;
        };

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(7,8));
        boolean res = contains2.test(list3, list4);
        System.out.println("contains2.test(list3,list4) = " + res);


    }
}
