package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,5,9,9,5));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);
        System.out.println("=================================================================");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);
        System.out.println("=================================================================");
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Scrum Master","BA","PO","BA","DEV"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("=================================================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1 = nums.contains(10);
        boolean r2 = nums.containsAll(Arrays.asList(2,5,10));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("=================================================================");

        String[] names = {"Josh", "Jack","Daniel","Shay","Breanna"};
        ArrayList<String> namesList= new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);
        /*
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);

         */

        System.out.println("=================================================================");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 = new ArrayList<>(convertArrayToArrayList(arr));
        System.out.println(list2);


    }

    public static ArrayList<Integer> convertArrayToArrayList (int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        return list;
    }
}
