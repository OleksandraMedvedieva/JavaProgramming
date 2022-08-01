package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Wolkswagen", "Juke", "Yellow", 2020, 20000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Reno", "Logan", "Grey", 2012, 7000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("BMW", "X5", "Black", 2015, 30000);
        System.out.println(car3);
        car1.drive();
        car3.stop();
        car2.start();

        // Car[] cars = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carList) {
            System.out.println(each.brand + " : " + each.price) ;
        }
        System.out.println("------------------------------------------------------------------------------");

        carList.removeIf(p -> p.brand.equals("BMW") && p.year>=2005 && p.year <=2008);
        carList.removeIf(p -> p.brand.equals("Toyota") &&  p.year>=1995&& p.year <=1997 );


    }
}
