package day43_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{


    public Eagle(String breed, char gender, int age, boolean isWild) {
        super("Eagle", breed, gender, age, isWild);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating meat");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " " + getBreed() + " is sleeping for 12 h");
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getBreed() + " is flying");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly 50 km/hour");
    }
}
