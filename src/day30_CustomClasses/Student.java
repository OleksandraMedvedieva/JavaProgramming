package day30_CustomClasses;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;


    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println(name + " is study");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
