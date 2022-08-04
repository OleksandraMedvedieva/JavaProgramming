package day39_Recap.animalTask;

public class WildAnimal extends Animal {
    private static boolean isWild, isFriendly, isPlayable;
    static{
        isWild = true;
        isFriendly = false;
        isPlayable = false;
    }

    public static boolean isIsWild() {
        return isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static boolean isIsPlayable() {
        return isPlayable;
    }

    public WildAnimal(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    public void hunt(){
        System.out.println(getBreed() + " " + getName() + " is hunting");
    }

    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                ", isWild=" + isWild +
                '}';
    }





}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */
