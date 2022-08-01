package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(nums); // hashcode
        System.out.println(Arrays.toString(nums));

        /*
        String str = "java";
        System.out.println("str = " + str.toString()); // toString()method implicitly called in String class
*/
        System.out.println("-----------------------------------------------------");

        int[] scores = {95,100,55,85,67,89};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min score: " + scores[0] );
        System.out.println("Max score: " + scores[scores.length-1] );

        String[] names = {"Gunay","Anna", "Zuhal", "Maria", "Sinema", "Ahmet"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {3,1,2};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("-----------------------------------------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r3 = Arrays.equals(ch1,ch2);
        System.out.println(r3);



    }
}
