package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " " + model + " is breaking down");
    }
    public void racing(){
        System.out.println(brand + " " + model + " is racing");
    }
}
