package day39_Recap.animalTask;

public class Cat extends FriendlyAnimal{
    public Cat(String breed, String size, String color, int age, char gender) {
        super("Cat", breed, size, color, age, gender);
    }
    public void scratch(){
        System.out.println(getBreed() + " " + getName() + " is scratching");
    }
    public void meow(){
        System.out.println(getBreed() + " " + getName() + " is meowing");
    }
}
/*
2. Cat:
					Extra methods:
						scratch()
						meow()
 */
