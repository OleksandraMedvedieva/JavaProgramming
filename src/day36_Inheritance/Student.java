package day36_Inheritance;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public static boolean isStudent = true;
    public static boolean isHuman = true;

    public String getName(){
        return name;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public char getGrade(){
        return grade;
    }

    public void setName(String name){
        if (name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }
    public void setAge(int age){
        if (age>90 || age<5){
            System.out.println("Invalid age: " + age);
        }
        this.age = age;

    }
    public void setGender(char gender){
        if (!(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender: " + "" + gender);
        }
        this.gender = gender;
    }
    public void setGrade(char grade){
        if (!(grade == 'A' || grade == 'B'|| grade == 'C' || grade == 'D'|| grade == 'F')){
            System.out.println("Invalid grade: " + "" + grade);
        }


    }
    public void setSchoolName(String schoolName){
        if (schoolName.isEmpty() || schoolName.isBlank()){
            System.out.println("Invalid school name: " + schoolName);
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                ", is Human='" + isHuman + '\'' +
                ", is Student='" + isStudent + '\'' +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying");
    }
}

/*
warmup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()

 */
