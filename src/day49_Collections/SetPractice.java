package day49_Collections;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};
/*
        Set<String> hashSet = new HashSet<>(Arrays.asList(arr));
        System.out.println("hashSet = " + hashSet);
        hashSet.toArray(new String[0]);

 */
        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new TreeSet<>(list));
        System.out.println("list = " + list);

        System.out.println("-------------------------------------------------------");

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
        System.out.println("nums[4] = " + nums[4]);

        System.out.println("-----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";
        String result = ""; //e5a4b4c4d3

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result+=each + Collections.frequency(Arrays.asList(str.split("")),each);
        }
        System.out.println(result);

        System.out.println("-----------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));
        System.out.println(names.toArray(new String[0])[2]);
        System.out.println( new ArrayList<>(names).get(4) );
        for (String each : names) {
            System.out.println(each);
        }


    }
}
