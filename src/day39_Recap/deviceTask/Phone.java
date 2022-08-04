package day39_Recap.deviceTask;

public class Phone extends Device{


    public Phone(String brand, String model, double price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling: " + phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting: " + phoneNum);
    }
}
/*

	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)
 */
