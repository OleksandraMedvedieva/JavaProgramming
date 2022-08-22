package day44_Abstraction.carTask;

public class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }

    @Override
    public void drive() {
        System.out.println("Push the start button");
    }
}
