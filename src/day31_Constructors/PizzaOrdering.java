package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas= new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza small = new Pizza('S',2,3);
            Pizza medium = new Pizza('M',3,4);
            Pizza large = new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(small,medium,large));
        }

        System.out.println("Total number of pizza: " + pizzas.size());
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice+=pizza.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);



    }
}

/*
Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
