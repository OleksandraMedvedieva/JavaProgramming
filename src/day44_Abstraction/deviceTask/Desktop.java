package day44_Abstraction.deviceTask;

public class Desktop extends Computer implements Downloadable{
    public Desktop(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color, false, true);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turn on by pressing the button on system unit");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turn off by pressing the button on system unit");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " could download app via browser");
    }
}
