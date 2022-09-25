package tests;

import java.util.Arrays;

public class Merge_Two_Arrays {
    public static void main(String[] args) {

        int [] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int [] nums2 = {11,12,13,14,15};
        int [] res = new int[nums1.length+ nums2.length];

        int i = 0;
        for (int each : nums1) {
            res[i++] = each;
        }
        for (int each : nums2) {
            res[i++] = each;
        }
        System.out.println(Arrays.toString(res));

    }
}
