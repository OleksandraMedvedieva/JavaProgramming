package day46_Polymorphism;

import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;
import day38_Inheritance.carTask.Car;

import java.util.ArrayList;

public class Cars {
    public static void main(String[] args) {

        Car[] cars = {
                new Toyota("Highlander", "white", 2015, 25500, 255000),
                new BMW("X5", "RED", 2020, 32000, 12000),
                new Toyota("Corolla", "PINK", 2018, 23000, 310000),
                new BMW("M3", "BLUE", 2022, 45000, 14030),
                new BMW("M5", "white", 2012, 15000, 15000),
                new BMW("M4", "orange", 2018, 36000, 19000),
                new BMW("7 Series", "Purple", 2012, 30000, 21000),
                new BMW("i3", "Black", 2008, 89000, 9000),
                new Toyota("Camry", "Black", 2011, 233333, 185000),
                new Toyota("Rav4", "Purple", 2018, 200000, 285000),
                new Toyota("Avalon", "white", 2018, 159000, 175230),
                new Tesla("Model 3", "white", 45000, 30000, 235000),
                new Tesla("Model Y", "Purple", 2018, 90000, 135000),
                new Tesla("Model X", "white", 2014, 156000, 235000),
                new Tesla("Model X", "Purple", 2019, 40000, 236000),
        };
        ArrayList<Car> recallList = new ArrayList<>();
        for (Car each: cars){
            if ( each.brand.equals("BMW") && (each.year >=1929 && each.year <=2022)  ){
                recallList.add(each);
            }
            if(each.brand.equals("Toyota") && (each.year == 2011 || each.year ==2010)  ){
                recallList.add(each);
            }
            if(each.brand.equals("Tesla") && (each.year ==2015 || each.year ==2016)  ){
                recallList.add(each);
            }

        }

        System.out.println(recallList);

        System.out.println("--------------------------------------------------------------------");
        double maxMileage = cars[0].miles;
        for (Car each : cars){
            if (each.miles > maxMileage){
                maxMileage = each.miles;
            }
        }
        System.out.println(maxMileage);
        System.out.println("--------------------------------------------------------------------");
        double minMileage = cars[0].miles;
        for (Car each : cars){
            if (each.miles < minMileage){
                minMileage = each.miles;
            }
        }
        System.out.println(minMileage);



    }
}
/*
1 Given the following array that contains the car objects:
				Car[] cars = {
		                new Toyota("Highlander", 2010, 25000, "White", 255000),
		                new BMW("X5", 2014, 32000, "Red", 12000),
		                new Toyota("Corolla", 2011, 20000, "White", 310000),
		                new BMW("M3", 2015, 33000, "Blue", 14030),
		                new BMW("M5", 2017, 35000, "Black", 15000),
		                new BMW("M4", 2018, 40000, "White", 19000),
		                new BMW("7 Series", 2009, 30000, "Purple", 21000),
		                new BMW("i3", 2011, 30000, "Black", 9000),
		                new Toyota("Camry", 2018, 30000, "Red", 185000),
		                new Toyota("Rav4", 2012, 23000, "Red", 285000),
		                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
		                new Tesla("Model 3", 2015, 45000, "White", 235000),
		                new Tesla("Model Y", 2017, 65000, "Black", 135000),
		                new Tesla("Model X", 2016, 48000, "White", 235000),
		                new Tesla("Model X", 2014, 48000, "White", 236000),
		        };

		        (import them from day38 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest mileage

			1.3 Write a program that can display the car that has the lowest mileage
 */
