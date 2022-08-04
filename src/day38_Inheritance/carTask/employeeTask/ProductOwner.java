package day38_Inheritance.carTask.employeeTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, String companyName, int age, int id, char gender, double salary) {
        super(name, "Product Owner", companyName, age, id, gender, salary);
    }

    public void work(){
        System.out.println(getName() + " " + getJobTitle() + "  preparing SRS ");
    }
    public void meeting(){
        System.out.println(getName() + " " + getJobTitle() + "  conduct a meeting");
    }
}
