package day06_PrimitiveTypeCastings;

public class Primitive_Castings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;   // short b =(short)a ; implicit casting
        int c = b; // compiler cast short b to int c ; int c = (int)b
        long d = c;
        float e = d;
        double f = e;

        System.out.println("_____________________________________________");

        int x = 55;
        short y = (short)x; // explicit casting
        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : " + m);

        double n = 9.8;
        int s = (int)n;
        System.out.println(n + " : " + s);

        System.out.println("_____________________________________________");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + " : " + s1);

        float q = 45.45F;
        long z = (long) q;
        System.out.println(q + " : " + z);





    }
}
