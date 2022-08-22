package day44_Abstraction.carTask;

public class CarShop {
    public static void main(String[] args) {

        Audi audi = new Audi("A8", "red",2021,24000);
        BMW bmw = new BMW("X6", "black", 2015, 45000);
        CydeoCar cydeoCar = new CydeoCar("EU9", "yellow", 2022, 123000);
        Honda honda = new Honda("Model", "orange", 2021, 56000);
        Mercedes mercedes = new Mercedes("Model", "grey", 2005, 15000);
        Nio nio = new Nio("L5", "white", 2022, 167000);
        Tesla tesla = new Tesla("M5", "violet", 2021, 78000);
        Toyota toyota = new Toyota("Camry", "pink", 2016,45000);
        tesla.selfDrive();
        nio.autoPark();



    }
}
