package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public int price;
    public static String os = "IOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;


    public void printModelAndPrice(){
        System.out.println(model + " : "+  price);
    }

    public void method1(){
        System.out.println(model);
        System.out.println(os);
    }

    public static void operatingSystem(){
        System.out.println(os);
    }



}
