package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Bob");
        System.out.println("employee1 = " + employee1);
        Employee employee2 = new Employee("Karla", 'F');
        System.out.println("employee2 = " + employee2);
        Employee employee3 = new Employee("Oleh", 'M', "SDET");
        System.out.println("employee3 = " + employee3);
        Employee employee4 = new Employee("Oleh", 'M', "SDET", 135000);
        System.out.println("employee4 = " + employee4);




    }
}
