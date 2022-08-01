package day37_Inheritance.animalTask;

import day37_Inheritance.animalTask.Animal;

public class Parrot extends Animal {

    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }
    public void fly(){
        System.out.println(name + " is flying");
    }
}
