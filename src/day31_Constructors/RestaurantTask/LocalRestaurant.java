package day31_Constructors.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Sasha Medvedieva", "Kyiv", 5);
        Server server1= new Server("Bob", 125, 75,true);
        Server server2= new Server("Mark", 123, 60,false);
        Server server3= new Server("Kim", 124, 75,true);
        Server server4= new Server("Oleh", 126, 60,false);
        Server server5= new Server("Oscar", 127, 75,true);

        ArrayList<Server> serversList = new ArrayList<>();
        Server[] serverArr = {server1,server2,server3,server4,server5};

        restaurant1.hireServer(serverArr);


/*
        restaurant1.hireServer(server1);
        restaurant1.hireServer(server2);
        restaurant1.hireServer(server3);
        restaurant1.hireServer(server4);
        restaurant1.hireServer(server5);
        restaurant1.terminateServer(123);

 */

        Chef chef1= new Chef("Lora", 128, 75,true);
        Chef chef2= new Chef("Kamila", 129, 60,false);
        Chef chef3= new Chef("Lesya", 130, 75,true);
        Chef chef4= new Chef("Makar", 131, 60,false);
        Chef chef5= new Chef("Perto", 132, 75,true);

        ArrayList<Chef> chefsList = new ArrayList<>();

        restaurant1.hireChef(chef1);
        restaurant1.hireChef(chef1);
        restaurant1.hireChef(chef1);
        restaurant1.hireChef(chef1);

        restaurant1.terminateChef(130);



        System.out.println(restaurant1);








    }
}

/*
6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	            Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */
