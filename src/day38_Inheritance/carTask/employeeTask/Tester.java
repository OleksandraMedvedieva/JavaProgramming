package day38_Inheritance.carTask.employeeTask;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }
    public void work(){
        System.out.println(getName() + " " + getJobTitle() + " is creating a ticket");
    }
    public void findBug(){
        System.out.println(getName() + " " + getJobTitle() + "  find a bug");
    }
}
