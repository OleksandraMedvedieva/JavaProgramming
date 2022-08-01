package week03;

public class UnaryOperator {

    public static void main(String[] args) {

        int a = 25;
        //System.out.println(++a);
        //System.out.println(--a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);

        a = 1;
        a = -a-- + a ++/-a-- * --a;
        System.out.println("a = " + a);

        System.out.println("===========");
        int x = 10;
        x+=2; // x = x +2
        System.out.println("x = " + x);
        x-=2; // x = x - 2
        System.out.println("x = " + x);
        x*=2;
        System.out.println("x = " + x);
        x/=2;
        System.out.println("x = " + x);
        x%=2;
        System.out.println("x = " + x);

        int num1 = 10;
        int num2 = 5;
        boolean b = num1>num2; // true

        System.out.println("===========");

        System.out.println("First number number is greater than Second number " + b);

        System.out.println("===========");

        int appleCount = 20;
        int orangeCount = 30;
        int pearCount = 30;
        boolean comp = appleCount < orangeCount || --orangeCount>=pearCount;
        System.out.println("comp = " + comp);
        System.out.println("orangeCount = " + orangeCount);

        boolean comp1 = appleCount > orangeCount || orangeCount-->=pearCount;
        System.out.println("orangeCount = " + orangeCount);






    }
}
