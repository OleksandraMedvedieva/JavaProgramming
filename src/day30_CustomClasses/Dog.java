package day30_CustomClasses;

public class Dog {

    public String name;      // instance variable
    public String breed;     // instance variable
    public char gender;      // instance variable
    public String color;     // instance variable
    public String size;      // instance variable
    public int age;          // instance variable

    public void setInfo(String dogName, String dogBreed, char dogGender,String dogColor,String dogSize,int dogAge ){
        name= dogName;
        breed = dogBreed;
        gender = dogGender;
        color = dogColor;
        size = dogSize;
        age = dogAge;


    }


    public void eat(){
        System.out.println(name + " is eating dog food.");
    }
    public void bark(){
        System.out.println(name + " is barking.");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }
}
