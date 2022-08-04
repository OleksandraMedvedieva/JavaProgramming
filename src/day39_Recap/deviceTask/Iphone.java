package day39_Recap.deviceTask;

public class Iphone extends Phone{
    public Iphone(String model, double price, boolean hasBattery) {
        super("Iphone", model, price, hasBattery);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is having a Face Time with email: " + email);
    }
}
