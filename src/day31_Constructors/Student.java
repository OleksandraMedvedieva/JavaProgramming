package day31_Constructors;

public class Student {
    public String name;
    public int age, id;
    public char gender, grade;

    public Student(String name, int age, int id, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }


}
