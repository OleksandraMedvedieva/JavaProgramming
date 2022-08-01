package day33_Statics;

public class Student {
    public String name;
    public char gender;
    public int studentID,age;
    public char grade;

    public Student (String name){
        this.name = name;
    }
    public Student (String name, char gender){
        this(name);
        this.gender = gender;
    }
    public Student (String name, int studentID){
        this(name);
        this.studentID = studentID;
    }
    public Student (String name, int studentID, char grade){
        this(name, studentID);
        this.grade = grade;
    }
    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }
    public Student(String name, char gender, int studentID, int age) {
        this(name, gender, age);
        this.studentID = studentID;
    }
    public Student(String name, char gender, int studentID, int age, char grade) {
        this(name, gender, studentID, age);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", studentID=" + studentID +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying");
    }


}



/*
Warmup tasks:

	Student Task:
		1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				Add a constructor that allows user to create object by setting the name of student

				Add a constructor that allows user to create object by setting the name and gender of the student

				Add a constructor that allows user to create object by setting the name and studentID of the student

				Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				Add a constructor that allows user to create object by setting the name, gender and age of the student

				Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student

				Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

				Actions:
					toString()
					study()
 */