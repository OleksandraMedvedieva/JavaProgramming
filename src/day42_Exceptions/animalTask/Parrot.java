package day42_Exceptions.animalTask;

public class Parrot extends Animal implements Playable, Flyable{


    public Parrot(String name, String breed, char gender, int age, boolean isWild) {
        super("Parrot", breed, gender, age, isWild);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 2 km/hour");
    }
}
