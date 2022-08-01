package day38_Inheritance.carTask;

import day38_Inheritance.carTask.Car;

public class Toyota extends Car {
    public Toyota(String model, String color, int year, double price, double miles) {
        super("Toyota", model, color, year, price, miles);
    }
    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

    public void start(){
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }


}
