package day34_GarbageCollection_AccessModifiers;


import day30_CustomClasses.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
/*
       String str = null;
        System.out.println(str.toLowerCase());

 */
        String str = "Wooden Spoon";

        Car car1 = new Car ("Toyota");
        car1 = null;
        System.out.println(car1);

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        new Dog();
        System.out.println("==============================================");
        String language = "python";
        language = "java";
        System.out.println(language);
        System.out.println("==============================================");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;
        list2.add(200);
        list2.addAll(Arrays.asList(300,400));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1 == list2);

        System.out.println("==============================================");


        Student student1 = new Student("Thair", 30, 143, 'M','B');
        student1.grade = 'A';
        Student student2 =  student1;
        student2.name = "Ahmet";
        System.out.println(student1);
        System.out.println(student2);


        System.out.println("==============================================");
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Python");
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);










    }
}
