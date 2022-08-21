package day44_Abstraction.carTask;

public class Toyota extends Car{
    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is driving fast");

    }
}
