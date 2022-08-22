package day44_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPilot, Flyable{
    public CydeoCar(String model, String color, int year, double price) {
        super("CydeoCar", model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {

    }
}
