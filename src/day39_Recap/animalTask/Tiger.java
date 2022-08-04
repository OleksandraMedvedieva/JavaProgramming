package day39_Recap.animalTask;

public class Tiger extends WildAnimal{
    public Tiger(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    public void run(){
        System.out.println(getBreed() + " " + getName() + " is running");
    }
}
