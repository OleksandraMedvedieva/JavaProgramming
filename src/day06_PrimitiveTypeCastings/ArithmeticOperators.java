package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(100+50); // addition
        System.out.println(50-25); // subtraction
        System.out.println(10*5); // multiplication

        System.out.println(100/3); // division
        System.out.println(100/3.0); // division
        System.out.println((double)100/3); // division
        System.out.println(100d/3); // division

        int a = 100;
        double b = a/6; // 16.0
        System.out.println(b);

        double c = a/6.0;
        double c1 = (double)a/6.0;
        System.out.println(c);
        System.out.println(c1);

        System.out.println(10%4); // modulus (reminder)
        System.out.println(20%4);

    }
}
