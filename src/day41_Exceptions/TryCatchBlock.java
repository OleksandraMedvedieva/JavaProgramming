package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try{
            System.out.println(9/0);
            System.out.println("Try block");
        }catch(ArithmeticException e){
            System.out.println("Catch block");

            System.out.println("ArithmeticException was occurred");

        }

        System.out.println("Test1 completed");

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Test2 started");
        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[200]);
            System.out.println("Try block");
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test2 completed");

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Test3 started");


        try{
            System.out.println("Cydeo".substring(2,0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test3 completed");

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");

        System.out.println("-----------------------------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("path of file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}

