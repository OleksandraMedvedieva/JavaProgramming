package day35_Encapsulation.restaurantTask2;

import java.util.ArrayList;

public class LocalRestaurant2 {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("AS", " ", 4);
        Server server1= new Server("Bob", 125, 75,true);
        Server server2= new Server("Mark", 123, 60,false);
        Server server3= new Server("Kim", 124, 75,true);
        Server server4= new Server("Oleh", 126, 60,false);
        Server server5= new Server("Oscar", 127, 75,true);

        ArrayList<Server> serversList = new ArrayList<>();
        Server[] serverArr = {server1,server2,server3,server4,server5};

        Chef chef1= new Chef("Lora", 128, 75,true);
        Chef chef2= new Chef("Kamila", 129, 60,false);
        Chef chef3= new Chef("Lesya", 130, 75,true);
        Chef chef4= new Chef("Makar", 131, 60,false);
        Chef chef5= new Chef("Perto", 132, 75,true);

        ArrayList<Chef> chefsList = new ArrayList<>();
        Chef[] chefArr = {chef2,chef3,chef4};

        System.out.println(server1.getName());
        server1.setName("Marko");
        System.out.println(server1.getName());

        r1.hireChef(chef1);
        r1.hireServer(serverArr);
        r1.hireChef(chefArr);
        System.out.println(r1);


    }
}
