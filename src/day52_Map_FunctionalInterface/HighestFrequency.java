package day52_Map_FunctionalInterface;

import java.util.*;

public class HighestFrequency {
    public static void main(String[] args) {
        String str = "eeeeeaaabbbbccccdd";
        Map<String, Integer> res = new LinkedHashMap<>();
        String[] arr = str.split("");

        for (String each : arr) {
            int count=0;
            for (String eachElement : arr) {
                if (each.equals(eachElement)){
                    count++;
                }
            }
            res.put(each,count);
        }
        System.out.println("res = " + res);

        System.out.println("======================================================");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("java", "java", "python", "c#"));
        Map<String, Integer> res2 = new LinkedHashMap<>();

        for (String each : list) {
            int count=0;
            for (String eachEl : list) {
                if (each==eachEl){
                   count++;
                }
            }
            res2.put(each,count);
        }

        int frequency = Integer.MIN_VALUE;
        String result = "";

        for (Map.Entry<String, Integer> eachEntry : res2.entrySet()) {
            if (eachEntry.getValue()>frequency){
                frequency = eachEntry.getValue();
                result=eachEntry.getKey();
            }
        }
        System.out.println("result = " + result);

    }
}
/*

Assignments:
	Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
 */