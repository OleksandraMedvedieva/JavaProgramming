package day37_Inheritance.animalTask;

import day37_Inheritance.animalTask.Animal;

public class Dog extends Animal {
    //public int a;

    public Dog(String name, String breed, String size, String color, char gender, int age){
        super( name,  breed,  size,  color,  gender,  age);
        //this.a = a;

    }
    public void bark(){
        System.out.println(name + " is barking");

    }
}
