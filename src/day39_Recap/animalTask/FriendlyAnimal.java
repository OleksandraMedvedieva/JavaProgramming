package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {
    private static boolean isWild, isFriendly,isPlayable;

    public FriendlyAnimal(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }
    static{
        isWild = false;
        isFriendly = true;
        isPlayable = true;
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

    public void play(){
        System.out.println(getBreed() + " " + getName() + " is playing");
    }
    public void pet(){
        System.out.println(getBreed() + " " + getName() + " is pet");
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
                ", isWild =" + isWild +
                '}';
    }



}

/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */
