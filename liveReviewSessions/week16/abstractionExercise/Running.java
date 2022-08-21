package week16.abstractionExercise;

public class Running extends Exercise{
    public Running(double weigth){
        super(weigth);
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int)(minutes*13*(weight/100));
    }

    @Override
    public void perform() {
        System.out.println("Performing running exercise on the Track");

    }
}
