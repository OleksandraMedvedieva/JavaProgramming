package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Mark");
        Student student2 = new Student("Olha", 'F');
        Student student3 = new Student("Pavlo", 123);
        Student student4 = new Student("Karl", 123, 'A');
        Student student5 = new Student("Aleksa", 'F', 25);
        Student student6 = new Student("Lev", 'M',148, 28);
        Student student7 = new Student("Robert", 'M',145,32,'B');
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        Student[] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));




    }
}
