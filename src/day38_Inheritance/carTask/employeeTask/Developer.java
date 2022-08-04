package day38_Inheritance.carTask.employeeTask;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }
    public void work(){
        System.out.println(getName() + " " + getJobTitle() + " is coding");
    }
    public void fixBug(){
        System.out.println(getName() + " " + getJobTitle() + "  fixing a bug");
    }
}
