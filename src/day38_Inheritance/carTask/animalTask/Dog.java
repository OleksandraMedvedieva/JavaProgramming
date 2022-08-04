package day38_Inheritance.carTask.animalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }
    public void eat(){
        System.out.println(getName() + " " +  getBreed()  + " eats DOG food");
    }
}
