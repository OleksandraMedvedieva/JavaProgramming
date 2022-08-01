package day35_Encapsulation.encapsulation;

public class Employee_Objects {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bill",'M',23,123000);

        System.out.println(e1);

        e1.setAge(32);

        System.out.println(e1);

        Employee e2 = new Employee("Asia",'F',23,145000);
        System.out.println(e2);
        e2.setSalary(e1.getSalary() + 15000);

        e2.setName("Fiona");
        System.out.println(e2);





    }
}
