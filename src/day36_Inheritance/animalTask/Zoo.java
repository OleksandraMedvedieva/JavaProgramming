package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Cat cat = new Cat();


        dog.setInfo("Rikky", "Corgi", "medium", "black and brown", 'M', 2);
        dog.eat();
        dog.drink();
        dog.bark();
        System.out.println(dog);

        cat.setInfo("Lucy", "Brithsh", "small", "grey", 'F', 5);
        cat.eat();
        cat.drink();
        cat.scratch();
        System.out.println(cat);

        tiger.setInfo("Sher Khan", "Bengal", "large", "orange", 'M', 4);
        tiger.eat();
        tiger.sleep();
        tiger.hunt();
        System.out.println(tiger);


    }
}
