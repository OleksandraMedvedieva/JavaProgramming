package day44_Abstraction.deviceTask;

public class Laptop extends Computer implements Downloadable{


    public Laptop(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color, true, true);
    }

    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turn on by pressing the button on laptop");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turn off by pressing the button on laptop");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " could download app via browser");
    }
}
