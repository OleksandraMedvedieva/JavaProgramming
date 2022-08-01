package day36_Inheritance.employeeTask;

public class Employee {

    public String name, jobTitle,companyName;
    public char gender;
    public int age,id;
    public double salary;

    public void setInfo(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }
    public void haveBreak(){
        System.out.println(name + " having a break");
    }
    public void lunch(){
        System.out.println(name + " having a lunch");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

/*
Employee:
		name, gender, age, jobTitle, id, salary, companyName
		setInfo(), work(), toString()


	Tester

	Developer

	Driver

	Teacher
 */
