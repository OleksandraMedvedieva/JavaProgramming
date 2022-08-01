import java.util.ArrayList;

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

class DogObjects{

    public static void main(String[] args) {

        day30_CustomClasses.Dog dog1 = new day30_CustomClasses.Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender= 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        day30_CustomClasses.Dog dog2 = new day30_CustomClasses.Dog();
        dog2.name = "Bonya";
        dog2.breed = "French Bulldog";
        dog2.age = 4;
        dog2.gender= 'F';
        dog2.size = "Small";
        dog2.color = "Light brown";

        System.out.println(dog2);

        day30_CustomClasses.Dog dog3 = new day30_CustomClasses.Dog();
        dog3.setInfo("Malysh", "French Bulldog", 'M',"Black & Brown",
                "Small", 3);
        System.out.println(dog3);

        dog1.eat();
        dog2.eat();
        dog3.bark();

        day30_CustomClasses.Dog dog4 = new day30_CustomClasses.Dog();
        dog4.setInfo("Jack", "German Shepard", 'M', "Black", "Large", 4);

        day30_CustomClasses.Dog dog5 = new day30_CustomClasses.Dog();
        dog5.setInfo("Bullet", "Labrador", 'F', "Yellow", "Extra Large", 1);

        day30_CustomClasses.Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        //System.out.println(Arrays.toString(dogs));
        ArrayList<day30_CustomClasses.Dog> femaleDogs =new ArrayList<>();
        ArrayList<day30_CustomClasses.Dog> maleDogs =new ArrayList<>();

        for (day30_CustomClasses.Dog each : dogs) {
            if (each.gender == 'M'){
                maleDogs.add(each);
            }else{
                femaleDogs.add(each);
            }
        }
        System.out.println(maleDogs);
        System.out.println(femaleDogs);


    }

}
