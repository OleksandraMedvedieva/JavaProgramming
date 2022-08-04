package day40_FinalKeyword;

public final class Dog extends Animal{
    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
    public void eat(){
        System.out.println(getName() + " is eating dog food");
    }
    public final void bark(){
        System.out.println(getName() + " is barking ");
    }



    public static void main(String[] args) {
        Dog dog = new Dog("Kora","Corgi", 'F',"Yellow", "Medium",4);
        dog.eat();
    }
}
