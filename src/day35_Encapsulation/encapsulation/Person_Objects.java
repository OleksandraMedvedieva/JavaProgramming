package day35_Encapsulation.encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Daniel");
        p1.setAge(156);

        System.out.println("name is " + p1.getName());
        System.out.println("age is "+ p1.getAge());
    }
}
