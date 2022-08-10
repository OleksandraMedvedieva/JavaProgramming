package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;


public class CheckVsUncheck {

    public static void main(String[] args) throws InterruptedException {

        // unchecked exception:
        int a = 10;
        int b = 0;
        //System.out.println(a/b);
        //System.out.println("Wooden spoon");
        char[] arr = {'A', 'B','C'};
        //System.out.println(arr[99]);
        Student student = null;
        //System.out.println(student.getName());
        //student.study();
        String str = "Wooden spoon";
        str = null;

        //System.out.println(str.toUpperCase());
        String str2 = "  ";
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        // checked exception:

        System.out.println("Hello");
        //Thread.sleep(3000);
        System.out.println("Cydeo");


        //FileInputStream file = new FileInputStream("path of file");






    }


}
