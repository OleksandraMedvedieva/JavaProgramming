package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "James", "Aaron", "Daniel","David"};

        String[] earlyBirds = Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        nums = Arrays.copyOf(nums,5);
        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D','E','F','G','H','I'};
        //             0    1    2    3   4   5   6   7   8
        char[] ch2 = Arrays.copyOfRange(ch1,2,4);
        System.out.println(Arrays.toString(ch2));

        int[] scores={10,20,30,40,50,60,70,80,90,100};
        //             0  1  2  3  4  5  6  7  8  9
        int[] result=Arrays.copyOfRange(scores,3,7+1);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));


    }
}
