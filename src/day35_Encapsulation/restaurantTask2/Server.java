package day35_Encapsulation.restaurantTask2;

public class Server {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            System.err.println("Invalid id");
            System.exit(1);
        }
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate<=0){
            System.err.println("Invalid rate");
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return fullTime;
    }
    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

    public void takeOrder() {
        System.out.println(name + "is taking an order");
    }
    public void cleanTable(){
        System.out.println(name + "is cleaning the table");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }

}
