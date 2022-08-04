package day39_Recap.animalTask;

public class Animal {
    private String name, breed, size, color;
    private char gender;
    private int age;

    public Animal(String name, String breed, String size, String color, int age, char gender) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setAge(age);
        setGender(gender);
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }

    public String getName() {
        return name;
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

    public String getBreed() {
        return breed;
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

    public String getSize() {
        return size;
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

    public String getColor() {
        return color;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!((gender+"").toLowerCase().equals("f") || (gender+"").toLowerCase().equals("m") )){
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }
    public void eat(){
        System.out.println(breed + " " + name + " is eating");
    }
    public void drink(){
        System.out.println(breed + " " + name + " is drinking");
    }
    public void sleep(){
        System.out.println(breed + " " + name + " is sleeping");
    }
    public void move(){
        System.out.println(breed + " " + name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

/*
Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()
 */
