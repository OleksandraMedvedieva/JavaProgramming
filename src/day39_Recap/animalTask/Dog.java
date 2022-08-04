package day39_Recap.animalTask;

public class Dog extends FriendlyAnimal{
    public Dog(String breed, String size, String color, int age, char gender) {
        super("Dog", breed, size, color, age, gender);
    }
    public void bark(){
        System.out.println(getBreed() + " " + getName() + " is barking");
    }

}
/*
1. Dog:
					Extra methods:
						bark()
 */
