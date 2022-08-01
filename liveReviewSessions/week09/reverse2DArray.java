package week09;

import java.util.Arrays;

public class reverse2DArray {
    public static void main(String[] args) {

        int [] arr1D_1 = {3,343,21,56,-10,100};
        int [] arr1D_2 = {3,13,41,46,-110,90,115};
        int [] arr1D_3 = {35,135,415,4602,-1110,190,1015};

        int[][] arr2D_1 = { arr1D_1, arr1D_2, arr1D_3};
        int [][] reversed2DArray = new int[arr2D_1.length][];

        int index2D =0;
        for (int i = arr2D_1.length -1; i>=0; i--){
            int[] reversed1DArray = new int [arr2D_1[i].length];
            int index1D = 0;
            for (int j = arr2D_1[i].length -1 ; j>=0; j-- ){
                reversed1DArray[index1D] = arr2D_1[i][j];
                index1D++;
            }
            reversed2DArray[index2D]=reversed1DArray;
            index2D++;

        }

        System.out.println(Arrays.deepToString(reversed2DArray));




    }
}
