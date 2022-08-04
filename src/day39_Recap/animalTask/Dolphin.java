package day39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String breed, String size, String color, int age, char gender) {
        super("Dolphin", breed, size, color, age, gender);
    }
    public void swim(){
        System.out.println(getBreed() + " " + getName() + " is swimming");
    }

}
/*

			3. Dolphin:
					Extra methods:
						swim()
 */
