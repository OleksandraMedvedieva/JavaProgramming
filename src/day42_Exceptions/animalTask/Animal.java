package day42_Exceptions.animalTask;

public abstract class Animal {

    private final String name, breed;
    private final char gender;
    private int age;
    private final boolean isWild;

    public Animal(String name, String breed, char gender, int age, boolean isWild) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        setAge(age);
        this.isWild = isWild;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setAge(int age) {
        if (age <= 0 ){
            throw new RuntimeException("invalid age: " + age);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isWild=" + isWild +
                '}';
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();

    public final void drink(){
        System.out.println(name + " " + breed + " is drinking water");
    }



}

/*
Animnal task:

		abstract Animal

			eat();

		Dog

		Cat

		Tiger

		Eagle


 */
