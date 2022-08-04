package day39_Recap.deviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }
    public void movable() {
        System.out.println(getBrand() + " " + getModel() + " is movable");
    }
}
