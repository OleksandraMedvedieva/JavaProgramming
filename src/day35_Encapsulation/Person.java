package day35_Encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;

    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public Person(String name, int age, char gender, String language){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", isHuman='" + isHuman + '\'' +
                ", hasNose='" + hasNose + '\'' +
                ", numberOfWings='" + numberOfWings + '\'' +
                ", numberOfHead='" + numberOfHead + '\'' +
                '}';
    }

    public static void printPlanetName(){
        System.out.println("Planet name is " + planet);
    }
    public String eat(String food){
        return name + " is eating " + food;
    }
    public String drink(String drink){
        return name + " is drinking " + drink;
    }


}


/*
warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
