package day44_Abstraction.carTask;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " has autopark feature");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " starting by pressing the button");

    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " driving like a race car");
    }
}
