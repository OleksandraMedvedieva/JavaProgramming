package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{
    public Parrot(String breed, String size, String color, int age, char gender) {
        super("Parrot", breed, size, color, age, gender);
    }
    public void fly(){
        System.out.println(getBreed() + " " + getName() + " is flying");
    }
    public void sing(){
        System.out.println(getBreed() + " " + getName() + " is singing");
    }
}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()
 */
