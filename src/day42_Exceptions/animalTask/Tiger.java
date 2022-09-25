package day42_Exceptions.animalTask;

public final class Tiger extends Animal implements WildAnimal{

    public Tiger(String breed, char gender, int age, boolean isWild) {
        super("Tiger", breed, gender, age, isWild);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating other animals");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " " + getBreed() + " is sleeping for 8 h");

    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getBreed() + " is walking, running and jumping");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts dears");
    }
}
