package day20_Arrays;


import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = {10, 5,6,7,7,7,7,};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
