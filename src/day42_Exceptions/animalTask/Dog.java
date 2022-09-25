package day42_Exceptions.animalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String breed, char gender, int age, boolean isWild) {
        super("Dog", breed, gender, age, isWild);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " " + getBreed() + " is sleeping for 14 hours");
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getBreed() + " is walking, running and jumping");
    }

    public void bark(){
        System.out.println(getName() + " " + getBreed() + " is barking");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with ball ");
    }
}
