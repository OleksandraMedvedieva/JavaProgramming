package day43_Abstraction.animalTask;

public class Objects {
    public static void main(String[] args) {

        Eagle eagle = new Eagle("Breed", 'm',4,true);
        System.out.println(eagle.getAge());
        System.out.println(eagle.getBreed());
        System.out.println(eagle.getName());
        System.out.println(eagle.getGender());
        System.out.println(eagle.isWild());
        eagle.setAge(23);
        System.out.println(eagle);
        eagle.eat();
        eagle.sleep();
        eagle.move();

        System.out.println("--------------------------------------------------");
        Dog dog = new Dog("Bulldog", 'm',4,false );
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());
        System.out.println(dog.getName());
        System.out.println(dog.getGender());
        System.out.println(dog.isWild());
        dog.setAge(23);
        System.out.println(dog);
        dog.eat();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println("--------------------------------------------------");
        
        Cat cat = new Cat("British", 'f', 2, false);
        System.out.println(cat.getAge());
        System.out.println(cat.getBreed());
        System.out.println(cat.getName());
        System.out.println(cat.getGender());
        System.out.println(cat.isWild());
        cat.setAge(23);
        System.out.println(cat);
        cat.eat();
        cat.sleep();
        cat.move();



    }
}
