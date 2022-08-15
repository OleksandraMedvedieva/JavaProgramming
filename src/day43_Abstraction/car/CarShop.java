package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

        // Car car1 = new Car("Cydeo", "EU9", "Blue", 2022,10000);
        // we can not create object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


        honda.setColor("yellow");
        tesla.setColor("red");
        audi.setColor("pink");

        honda.setPrice(56000);
        tesla.setPrice(256000);
        audi.setPrice(146000);

        System.out.println("-------------------------------------------");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



    }
}
