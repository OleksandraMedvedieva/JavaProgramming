package day39_Recap.animalTask;

public class Python extends WildAnimal{
    public Python(String breed, String size, String color, int age, char gender) {
        super("Python", breed, size, color, age, gender);
    }
    public void crawl(){
        System.out.println(getBreed() + " " + getName() + " is crawling");
    }
}
