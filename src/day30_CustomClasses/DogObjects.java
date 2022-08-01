package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender= 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Bonya";
        dog2.breed = "French Bulldog";
        dog2.age = 4;
        dog2.gender= 'F';
        dog2.size = "Small";
        dog2.color = "Light brown";

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Malysh", "French Bulldog", 'M',"Black & Brown",
                "Small", 3);
        System.out.println(dog3);

        dog1.eat();
        dog2.eat();
        dog3.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Jack", "German Shepard", 'M', "Black", "Large", 4);

        Dog dog5 = new Dog();
        dog5.setInfo("Bullet", "Labrador", 'F', "Yellow", "Extra Large", 1);

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        //System.out.println(Arrays.toString(dogs));
        ArrayList<Dog> femaleDogs =new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();

        for (Dog each : dogs) {
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
