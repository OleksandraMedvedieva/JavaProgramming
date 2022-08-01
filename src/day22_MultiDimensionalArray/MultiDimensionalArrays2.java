package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};

        // 3d array contains 2D arrays

        int[][][] arr3D = {{{1,2,3}, {4,5,6}, {7,8,9}} , {{10,20,30}, {40,50,60}, {70,80,90}}};
        //index  of 2d arrays        0                                  1
        //index  of 1d arrays   0         1        2            0           1             2
        //index  of elements  0 1 2    0 1 2    0 1 2       0  1  2     0  1  2     0  1  2

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[1][1][2]);


        System.out.println("------------------------------------------------");
        for(int[][] each2D: arr3D){
            for (int[] each1D : each2D ){
                for (int eachElement : each1D){
                    System.out.print(eachElement + " ");
                }
                System.out.println();
            }

        }
        System.out.println("------------------------------------------------");


        int[][][][] arr4D = { {{{1,2,3}, {4,5,6}, {7,8,9}} , {{10,20,30}, {40,50,60}, {70,80,90}}}   };
//index  of 3d arrays                                      0


        for (int[][][] each3D : arr4D) {
            for (int[][] each2d : each3D) {
                for (int[] each1d : each2d) {
                    for (int eachElement : each1d) {
                        System.out.print(eachElement + " ");
                    }
                    System.out.println();
                }

            }
        }



    }
}
