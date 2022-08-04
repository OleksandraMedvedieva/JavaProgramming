package day38_Inheritance.carTask.employeeTask;

public class Employee {
    private String name, jobTitle, companyName;
    private int age,id;
    private char gender;
    private double salary;


    public Employee(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setAge(age);
        setId(id);
        setGender(gender);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Invalid name: " + name);
            System.exit(0);
        }
        if (name.isBlank() || name.isEmpty() || !(Character.isLetter(name.charAt(0)))){
            System.err.println("Invalid name: " + name);
            System.exit(0);
        }
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null){
            System.err.println("Invalid jobTitle: " + jobTitle);
            System.exit(0);
        }
        if (jobTitle.isBlank() || jobTitle.isEmpty() || !(Character.isLetter(jobTitle.charAt(0)))){
            System.err.println("Invalid jobTitle: " + jobTitle);
            System.exit(0);
        }
        this.jobTitle = jobTitle;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null){
            System.err.println("Invalid companyName: " + companyName);
            System.exit(0);
        }
        if (companyName.isBlank() || companyName.isEmpty() || !(Character.isLetter(companyName.charAt(0)))){
            System.err.println("Invalid companyName: " + companyName);
            System.exit(0);
        }
        this.companyName = companyName;
    }

    public void setAge(int age) {
        if (age<=0 || age >=120){
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(char gender) {
        if (!((gender+"").toLowerCase().equals("f") || (gender+"").toLowerCase().equals("m") )){
            System.err.println("Invalid gender: " + gender);
            System.exit(0);
        }
        this.gender = gender;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Invalid salary: " + salary);
            System.exit(0);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " " + jobTitle + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }
}

/*
1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them
 */
