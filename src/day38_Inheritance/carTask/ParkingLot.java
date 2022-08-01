package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "red", 2020,20000,2365214);
        Tesla tesla = new Tesla("Model S", "Grey", 2022,94990,0);
        BMW bmw = new BMW("X6", "black", 2016,56000,123654);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
