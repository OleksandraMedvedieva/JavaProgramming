package day39_Recap.deviceTask;

public class Samsung extends Phone{
    public Samsung(String model, double price, boolean hasBattery) {
        super("Samsung", model, price, hasBattery);
    }
    public void freeze() {
        System.out.println(getBrand() + " " + getModel() + " is freezing");
    }
}
