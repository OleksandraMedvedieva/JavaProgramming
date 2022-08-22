package day44_Abstraction.deviceTask;

public final class Iphone extends Phone implements AppleApps{

    public Iphone(String model, String size, double price, String color) {
        super("Iphone", model, size, price, color, true, true);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is having a Face Time with email: " + email);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turn on by pressing the button");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turn off by pressing the button");
    }

    @Override
    public void downloadApp() {
        System.out.println("You can find and download app for " + getBrand() + " " + getModel() + AppStoreName);
    }
}
