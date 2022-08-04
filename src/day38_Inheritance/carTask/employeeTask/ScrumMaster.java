package day38_Inheritance.carTask.employeeTask;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, String companyName, int age, int id, char gender, double salary) {
        super(name, "Scrum Master", companyName, age, id, gender, salary);
    }

    public void work(){
        System.out.println(getName() + " " + getJobTitle() + "  facilitate a scrum meeting");
    }

}
