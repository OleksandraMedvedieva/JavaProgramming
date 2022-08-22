package day44_Abstraction.deviceTask;

public class Samsung extends Phone implements AndroidApps{

    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color, true, false);
    }

    public void freeze() {
        System.out.println(getBrand() + " " + getModel() + " is freezing");
    }


    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turn on by pressing the button on the keyboard");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turn off by pressing the button on the keyboard");
    }

    @Override
    public void downloadApp() {
        System.out.println("You can find and download app for " + getBrand() + " " + getModel() + AppStoreName);
    }
}
