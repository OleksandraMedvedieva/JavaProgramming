package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> nums;


    public Circle(double radius) {
        this.radius = radius;
    }

    static {
        pi = 3.14;
        name = "Circle";
        nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);

        

    }
}
