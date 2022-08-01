package day37_Inheritance.animalTask;

public class Objects {
    public static void main(String[] args) {


        Dog dog = new Dog("Lucy", "Labrador", "large", "yellow", 'F',2);
        System.out.println(dog);
        Cat cat = new Cat("Alisa", "British", "small", "grey", 'F', 4);
        System.out.println(cat);
        Parrot parrot= new Parrot("Lyi", "Macaw", "small", "yellow", 'M',3);
        parrot.fly();
        cat.scratch();
        dog.bark();


    }
}
