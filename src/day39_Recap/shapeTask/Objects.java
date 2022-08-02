package day39_Recap.shapeTask;

public class Objects {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3,6);
        Square square = new Square(8);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(square.perimeter());


    }
}
