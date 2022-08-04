package day39_Recap.animalTask;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }
    public void flyAndHunt(){
        System.out.println(getBreed() + " " + getName() + " is flying and hunting");
    }
}
