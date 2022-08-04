package day38_Inheritance.carTask.employeeTask;

public class Driver extends Employee{
    public Driver(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }
    public void work(){
        System.out.println(getName() + " " + getJobTitle() + "  is driving");
    }
}
