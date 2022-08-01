package day30_CustomClasses;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2123, 'B');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F',26,2215,'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M',28,5511,'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');

        Student[] students = {student1, student2,student3,student4,student5};
        for (Student each : students) {
            System.out.println(each);
        }
        System.out.println("----------------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student each : students) {
            if (each.grade == 'A'){
                earlyBirds.add(each);
            }else {
                angryBirds.add(each) ;
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        System.out.println("----------------------------------------------------------------------");



    }
}
