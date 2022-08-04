package day39_Recap.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Parrot parrot = new Parrot("Iogu", "small", "red", 1,'m');
        System.out.println(parrot);
        parrot.sing();
        parrot.eat();

        Python python = new Python("Snaking", "big", "grey", 45,'f');
        System.out.println(python);
        python.crawl();
        python.setAge(23);
        System.out.println(python);
        python.drink();
    }
}
/*
6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */
