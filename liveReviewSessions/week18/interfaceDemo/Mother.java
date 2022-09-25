package week18.interfaceDemo;

public class Mother extends Parent{
    @Override
    public void raiseKid() {
        System.out.println("Raising the kids");
    }

    @Override
    public void playKid() {
        System.out.println("Playing with the kid most of the time");
    }

    @Override
    public void feedKid() {
        System.out.println("Preparing the food");
    }
}
