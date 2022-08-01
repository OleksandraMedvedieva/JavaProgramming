package day35_Encapsulation.restaurantTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    private String owner,location ;
    private int numberOfStars;
    private ArrayList<Server> servers;
    private ArrayList<Chef> chefs;

    public String getOwner() {
        return owner;
    }
    public String getLocation() {
        return location;
    }
    public int getNumberOfStars() {
        return numberOfStars;
    }
    public ArrayList<Server> getServers() {
        return servers;
    }
    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    public void setOwner(String owner) {
        if (owner.isBlank() || owner.isEmpty()){
            System.err.println("Invalid owner");
            System.exit(1);
        }
        this.owner = owner;
    }
    public void setLocation(String location) {
        if (location.isBlank() || location.isEmpty()){
            System.err.println("Invalid location");
            System.exit(1);
        }
        this.location = location;
    }
    public void setNumberOfStars(int numberOfStars) {
        if (numberOfStars>5 || numberOfStars<1){
            System.err.println("Invalid number of stars: " + numberOfStars);
            System.exit(1);
        }
        this.numberOfStars = numberOfStars;
    }

    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server [] serversArr){
        for (Server each : serversArr) {
            servers.add(each);
        }
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chefsArr){
        for (Chef each : chefsArr) {
            chefs.add(each);
        }
    }
    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.getEmployeeID() == employeeID);
    }
    public void terminateServer(int employeeID){
        servers.removeIf(p-> p.getEmployeeID() == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}


/*

6.3 Create a class called Restaurant

Attributes:
Owner (String), Location (String), numberOfStars (int)
Servers (ArrayList of Server objects)
Chefs (ArrayList of Chef objects)

 Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)
hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

toString(): Return (String) of all the information of a Restaurant object.
No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information
 */
