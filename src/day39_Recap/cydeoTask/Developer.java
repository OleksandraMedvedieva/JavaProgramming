package day39_Recap.cydeoTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing Bugs");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is writing codes");
    }
}

/*
4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */
