package day17_While_DoWHile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A' ; i <= 'Z' ; i++){

            if (i == 'F'){
                break; // exits the loop
            }
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("======================================================");
        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num < 0){
                break;
            }
        }




    }
}
