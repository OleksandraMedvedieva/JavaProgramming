package day43_Abstraction.shapeTask;

public class Objects {
    public static void main(String[] args) {

        Square square = new Square(3);
        System.out.println(square.area());
        System.out.println(square.getName());
        System.out.println(square.getS());
        square.setS(10);
        System.out.println(square.perimeter());

        System.out.println("----------------------------------------------");

        Rectangle rectangle = new Rectangle(2, 10);
        System.out.println(rectangle.area());
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getL());
        System.out.println(rectangle.getW());
        rectangle.setW(12);
        rectangle.setL(2);
        System.out.println(rectangle.perimeter());

        System.out.println("----------------------------------------------");
        Circle circle = new Circle(80);

        System.out.println(circle.area());
        System.out.println(circle.getName());
        System.out.println(circle.getR());
        circle.setR(10);
        System.out.println(circle.perimeter());





    }
}
