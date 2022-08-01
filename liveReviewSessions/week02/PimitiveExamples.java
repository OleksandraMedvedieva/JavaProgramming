package week02;

public class PimitiveExamples {
    public static void main(String[] args) {

        byte num1;
        num1 = 100; // assign the value
        num1 = 121; // re-assign the different value
        short num2 = 12391;
        int distance = 1_000_000_000;
        System.out.println("distance = " + distance);
        long distance_more = 3_000_000_000l;
        long distance_shorter = 1_000_000_000;
        float rate = 1000.5f;
        double dNumber = 123.4;

        System.out.println("================Casting=======================");

        num2 = num1; // implicit casting
        System.out.println("num2 = " + num2);
        num2 = (short) distance; // explicit casting
        System.out.println("num2 = " + num2);
        char ch= 'a';
        System.out.println("ch = " + ch);
        int x = 5 + ch;
        System.out.println("x = " + x);

        String str = "" + 'J' + 'A' + 'V' + "A"; // empty "" makes all the chars coming after run intro string
        System.out.println("str = " + str);

        int y = 'J'+'a'+'v'+'a';
        System.out.println("y = " + y); // 386 - due to ascii tale

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b2 = " + b2);



    }



}
