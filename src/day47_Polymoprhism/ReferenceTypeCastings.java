package day47_Polymoprhism;

import day42_Exceptions.animalTask.Animal;
import day42_Exceptions.animalTask.Cat;
import day42_Exceptions.animalTask.Dog;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {


        Shape shape = (Shape) new Circle(4); // upcasting
        Shape shape2 = new Circle(4);

        Animal animal = (Animal) new Dog("Max", 'M', 3, false);
        //animal.bark(0);
        //Dog dog = (Dog) animal;  // down-casting
        //dog.bark();

        System.out.println(animal.getName());
        //System.out.println(dog.getName());
        ( (Dog)animal ).bark(); // down-casting

        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide()  );


        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Scotish", 'M', 3, false);
        //Cat cat = (Cat) animal2;
        //cat.meow();
        ((Cat)animal2).meow();
        // ( (Dog) animal2 ).bark(); - ClassCastException ^ Dog and Cat class does not have IS A relation

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        ((Tester)employee).bugReport();

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();



    }
}
