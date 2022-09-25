package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {
    /*
    static BiPredicate<Integer[], Integer> isContained =
            (t, u) -> {
                boolean r = false;
                for (Integer each : t) {
                    if (each == u) {
                        r = true;
                        break;
                    }
                }
                return r;

            };

     */
    public static void main(String[] args) {

        //Create a function that can check if the Integer is contained in an array of integer, return boolean
        BiPredicate<Integer[], Integer> isContained =
                (t, u) -> {
                    boolean r = false;
                    for (Integer each : t) {
                        if (each == u) {
                            r = true;
                            break;
                        }
                    }
                    return r;

                };
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("isContained.test(arr,11) = " + isContained.test(arr, 11));
        System.out.println("=========================================");
        // create a function that can check if two strings are anagram
        BiPredicate<String, String> anagram =
                (t,u)->{
            String [] arr1 = t.split("");
                    String [] arr2 = u.split("");
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
                    return Arrays.equals(arr1,arr2);
                };

        System.out.println("=========================================");
        // create a function that can print the given string for given number of times
        BiConsumer<String,Integer> printMultipleTimes =
                (t,u)->{
                    for (int i = 0; i < u; i++) {
                        System.out.println(t);
                    }
                };
        printMultipleTimes.accept("Wooden Spoon", 5);

        System.out.println("=========================================");

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        scrumTeam1.forEach( (k,v) -> {
            System.out.println(k + ":" + v);
        });

        System.out.println("=========================================");

        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> maxNumber =
                (a, b) ->
                     (a > b) ? a : b;
        int max = maxNumber.apply(100,200);
        System.out.println("max = " + max);

        System.out.println("=========================================");
        //2. create a function that can merge two integer arrays into a list

        BiFunction<int[], int[], List<Integer>> mergeToList =
                (x,y)->{
                    List<Integer> list = new ArrayList<>();
                    for (int each : x) list.add(each);
                    for (int each : y) list.add(each);
                    return list;
                };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        List<Integer> list =mergeToList.apply(arr1,arr2);
        System.out.println("list = " + list);
        System.out.println("=========================================");
        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}
        map ==> {Josh=100, Daniel=110}
         */
        BiFunction<List<String>, List<Integer>, Map<String, Integer>> mergeToMap =
                (j, k) -> {
                    Map<String, Integer> res = new HashMap<>();
                    for (int i = 0; i < j.size(); i++) {
                        res.put(j.get(i), k.get(i));
                    }
                    return res;
                };
        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        System.out.println("mergeToMap.apply(names,scores) = " + mergeToMap.apply(names, scores));


    }
}
