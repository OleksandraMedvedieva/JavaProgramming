package day44_Abstraction.deviceTask;

public class Google extends Phone implements AndroidApps{
    public Google(String model, String size, double price, String color) {
        super("Google", model, size, price, color, true, true);
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
    public void selfDefense(){
        System.out.println("You can use "+getBrand()+" "+getModel()+" as self defense tool");
    }
}
