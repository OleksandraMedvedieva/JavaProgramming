package day44_Abstraction.deviceTask;

public class PersonalComputer extends Computer implements Downloadable{


    public PersonalComputer(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color, false, true);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turn on by pressing the button on system unit");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turn on by pressing the button on system unit or via operating system");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " could download app via browser");
    }
}
