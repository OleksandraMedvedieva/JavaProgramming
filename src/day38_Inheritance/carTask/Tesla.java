package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, double price, double miles) {
        super("Tesla", model, color, year, price, miles);
    }
    public void autoPilot(){
        System.out.println(brand + " " + model + " has auto pilot");
    }

    public void start(){
        System.out.println("Say \"start\" to start " + brand + " " + model);

    }
}
