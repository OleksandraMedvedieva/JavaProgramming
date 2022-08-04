package day39_Recap.animalTask;

public class Bear extends WildAnimal{
    public Bear(String breed, String size, String color, int age, char gender) {
        super("Bear", breed, size, color, age, gender);
    }

    public void hibernation(){
        System.out.println(getBreed() + " " + getName() + " falls into hibernation");
    }
}
