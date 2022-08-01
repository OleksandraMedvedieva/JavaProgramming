package day22_MultiDimensionalArray;

import com.sun.security.jgss.GSSUtil;

public class IteratingMultidimensionalArrays2 {
    public static void main(String[] args) {

// index of elements:      0 1 2    0 1 2 3 4    0 1  2  3  4
        int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
// index of arrays:          0         1             2

        for (int i = arr2D.length - 1; i >= 0; i--) { // i : index number if 1d arrays
            for (int j = 0; j < arr2D[i].length; j++) { // j : index number of elements from the exact array
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j= arr2D[i].length - 1; j >= 0; j--) {
                System.out.print( arr2D[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print( arr2D[i][j] + " " );
            }
            System.out.println();

        }




    }
}
