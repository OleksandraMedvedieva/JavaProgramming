package day44_Abstraction.deviceTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("X", "medium", 1000,"grey");
        iphone.downloadApp();
        iphone.turnOff();
        iphone.turnOn();
        iphone.faceTime(123444444);
        System.out.println(iphone);
    }
}
