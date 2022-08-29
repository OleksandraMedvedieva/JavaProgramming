package week17;

public class TestEdible {
    public static void main(String[] args) {

        //Object[] objects = {new Tiger(), new Chicken(), new Apple()}; same with Object[] objects = {tiger,chicken,apple}; - here
        // we have a references
        //instanceof
        Tiger tiger=new Tiger();
        Chicken chicken=new Chicken();
        Apple apple=new Apple();
        Object[] objects = {tiger,chicken,apple};
        for (int i = 0; i < objects.length ; i++){
            if(objects[i] instanceof Edible){
                ((Edible) objects[i]).howToEat();
            }
        }
        tiger.sound();
        chicken.someMethod();  // call a static method from interface
        chicken.howToEat();   // from interface
        apple.howToEat();    // from interface
        apple.someMethod(); // call a static method from interface
        apple.someMethod1();  // from interface
        Edible.staticMethod(); // how we call a static method with interface name
        // Chicken.someMethod(); static methods belong to classes or interfaces only! Cn be called with th class/interface name to which ir belongs


    }
}

interface Edible{
    String howToEat(); // implicitly public abstract

    default void someMethod(){           // it is optional to override it, because it is static
        System.out.println("I am from Interface, default method");
    }
    static void staticMethod(){
        System.out.println("I am static method from the interface");
    }

}

interface moreInterface{
    void someMethod1();
}

abstract class Animal{
    //return animal sound
    public abstract String sound();
}

class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "Chicken : Fry it";
    }

    @Override
    public String sound() {
        return "Chicken : cock-a-doodle-do";
    }
}

class Tiger extends Animal{

    @Override
    public String sound() {
        return "Tiger : is roaring";
    }
}

abstract class Fruit implements Edible,  moreInterface{
    // implementing abstract methods in interface is optional , as it is abstract class

}

class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "Make apple cider and drink";
    }

    @Override
    public void someMethod1() {
        System.out.println("from interface1");
    }
}

class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }


    @Override
    public void someMethod1() {
        System.out.println("from interface1");
    }
}



