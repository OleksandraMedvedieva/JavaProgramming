package day39_Recap.deviceTask;

public class TV extends Device{
    public TV(String brand, String model, double price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }
    public void channelUp(){
        System.out.println(getBrand() + " " + getModel() + "  possible channel Up");
    }
    public void channelDown(){
        System.out.println(getBrand() + " " + getModel() + "  possible channel down");
    }
}
/*
4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */
