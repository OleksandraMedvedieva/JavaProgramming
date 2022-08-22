package day44_Abstraction.deviceTask;

public abstract class Phone extends Device {


    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getModel() + " " + getBrand() + " is calling to number: " + phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getModel() + " " + getBrand() + " is texting to number: " + phoneNum);
    }



}
