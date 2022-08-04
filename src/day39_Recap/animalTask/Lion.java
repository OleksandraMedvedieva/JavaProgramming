package day39_Recap.animalTask;

public class Lion extends WildAnimal{
    public Lion(String breed, String size, String color, int age, char gender) {
        super("Lion", breed, size, color, age, gender);
    }
    public void roar(){
        System.out.println(getBreed() + " " + getName() + " is roaring");
    }
}
