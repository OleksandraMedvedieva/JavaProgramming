package day44_Abstraction.carTask;

public class BMW extends Car{
    public BMW(String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }

    @Override
    public void drive() {
        System.out.println("Drive like race car");

    }
}
