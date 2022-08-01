package week7and8;

import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {

        int[] nums = {5,5,10,100,50,35};
        int[] nums2 = nums;
        System.out.println("nums2.equals(nums) = " + Arrays.equals(nums,nums2));
        System.out.println(nums==nums2);
        int[] nums3 = {5,5,10,100,50,35};
        System.out.println("nums3.equals(nums) = " + Arrays.equals(nums,nums3));
        System.out.println(nums==nums3); //false - not the same object
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums2));

        nums[0] = 1000;
        System.out.println(nums2[0]);

        int[] nums4 = Arrays.copyOf(nums3,nums3.length);
        System.out.println(Arrays.toString(nums4));
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));


    }
}
