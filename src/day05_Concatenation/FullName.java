package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String first_name = "Oleksandra";
        String last_name = "Medvedieva";
        int age = 29;
        String job_title = "SDET";
        String company_name = "Cydeo";
        double salary = 10000.5;

        String full_name = first_name + " " + last_name;
        System.out.println("Full name of the person is " + full_name);
        System.out.println(full_name + " is " + age + " old.");
        System.out.println(full_name + " is " + job_title + ", works at " + company_name + ", and " + full_name + "'s salary is $" + salary);

    }
}
