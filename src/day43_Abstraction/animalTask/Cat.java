package day43_Abstraction.animalTask;

public final class Cat extends Animal implements Playable{

    public Cat(String breed, char gender, int age, boolean isWild) {
        super("Cat", breed, gender, age, isWild);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " " + getBreed() + " is sleeping for 18 h");
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getBreed() + " is walking, running and jumping");
    }
    public void meow(){
        System.out.println(getName() + " " + getBreed() + " is meowing");
    }

    @Override
    public void play() {
        System.out.println(getName() +" is playing with mouse");
    }
}
