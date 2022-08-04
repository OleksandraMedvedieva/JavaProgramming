package day38_Inheritance.carTask.animalTask;

public class Objects {
    public static void main(String[] args) {
        Animal an1 = new Animal("Loffi","Yasd","small", "black", 23,'M');
        System.out.println(an1);
        an1.eat();
        Cat cat1 = new Cat("sdd", "British", "big", "grey", 1, 'f');
        System.out.println(cat1);
        cat1.eat();
    }
}
