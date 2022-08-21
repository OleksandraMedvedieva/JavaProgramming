package week16.abstractionExercise;

public abstract class Exercise {
    public double weight;
    public Exercise(double weight){
        this.weight = weight;
    }
    public void start(){
        System.out.println("Warming up and starting exercise");
    }

    public abstract int getCaloriesCount(int minutes);
    public abstract void perform();

    public static void giveUpAndEatJunkFood(){
        System.out.println("Some realistic method");
    }



}
