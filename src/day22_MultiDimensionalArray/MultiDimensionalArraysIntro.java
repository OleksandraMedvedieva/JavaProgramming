package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {
        String[] group1= {"John", "Joes", "Jemes"};
        String[] group2= {"Aaaron", "Britney", "Shay"};
        String[] group3= {"Cassandra", "Tahit", "Aygun"};

        String[][] groups = new String[3][];//index (of arrays) : 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        System.out.println();
        System.out.println(Arrays.deepToString(groups));
        System.out.println("---------------------------------------------------------------------");

// index of elements:      0 1 2    0 1 2 3    0 1 2  3  4
        int[][] arr2d = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
// index of arrays:          0         1             2
        System.out.println(Arrays.deepToString(arr2d));

        // {4,5,6,7}

        System.out.println(Arrays.toString(arr2d[1]));

        //11

        System.out.println( arr2d[2][3] );














    }
}
/*
String[] group1= {"John", "Joes", "Jemes"}
String[] group2= {"John", "Joes", "Jemes"}
String[] group3= {"John", "Joes", "Jemes"}
 */
