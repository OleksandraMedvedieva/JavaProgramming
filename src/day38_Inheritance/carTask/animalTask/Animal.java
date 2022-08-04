package day38_Inheritance.carTask.animalTask;

public class Animal {

    private String name, breed,size, color;
    private int age;
    private char gender;

    public Animal(String name, String breed, String size, String color, int age, char gender) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Invalid name");
            System.exit(0);
        }
        if (name.isBlank() || name.isEmpty() || !(Character.isLetter(name.charAt(0)))){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }

    public void setBreed(String breed) {

        if (breed == null){
            System.err.println("Invalid breed");
            System.exit(0);
        }
        if (breed.isBlank() || breed.isEmpty() || !(Character.isLetter(breed.charAt(0)))){
            System.err.println("Invalid breed");
            System.exit(0);
        }

        this.breed = breed;
    }

    public void setSize(String size) {
        if (size == null){
            System.err.println("Invalid size: " + size);
            System.exit(0);
        }
        if (size.isBlank() || size.isEmpty() || !(Character.isLetter(size.charAt(0)))){
            System.err.println("Invalid size: " + size);
            System.exit(0);
        }
        this.size = size;
    }

    public void setColor(String color) {
        if (color == null){
            System.err.println("Invalid color");
            System.exit(0);
        }
        if (color.isBlank() || color.isEmpty() || !(Character.isLetter(color.charAt(0)))){
            System.err.println("Invalid color");
            System.exit(0);
        }
        this.color = color;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!((gender+"").toLowerCase().equals("f") || (gender+"").toLowerCase().equals("m") )){
            System.err.println("Invalid gender: " + gender);
            System.exit(0);
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " " +  breed  + " is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
Animal Task:
	1. Create a class named Animal:
			Variables:
				name, breed, age, gender, size, color

			Add a constructor to set all the fields

			methods:
				eat()
				toString()

	2. Create the followin sub classes of Animal and override the eat method:
			1. Cat
					eat(): eats cat food

			2. Dog
					eat(): eats dog food

			3. Tiger
					eat(): eats deer

			4. Eagle
					eat(): eats snake
 */
