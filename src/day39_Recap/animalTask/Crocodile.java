package day39_Recap.animalTask;

public class Crocodile extends WildAnimal{
    public Crocodile(String breed, String size, String color, int age, char gender) {
        super("Crocodile", breed, size, color, age, gender);
    }
    public void bite(){
        System.out.println(getBreed() + " " + getName() + " is biting");
    }
}
