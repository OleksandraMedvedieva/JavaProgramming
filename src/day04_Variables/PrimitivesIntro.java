package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //AGE - 38 years old

        byte age = 38;

        // weight 160 pounds
        // byte age = 160;  it is out of the bytes' range

        short weight = 160; // 160 isin the range of short

        // salary 100 000 $
        // short salary = 100000 - it is out of the short range
        int salary = 100_000;

        // int asset = 3_333_333_333; it is out of range int

        long asset = 3_333_333_333l;

        // L/l - long data type out of the int range

        //tax: 0.26

        float tax = 0.26F;  // F/f - float data type out of the double range

        // #

        char ch1 = '#';
        char ch2 = 35;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        boolean isMarried = true;
        boolean isEmployed = false;
        boolean result = 130 > 20;
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("result = " + result);
        System.out.println("isEmployed = " + isEmployed);

        String name = "Wooden Spoon";
        String city = "Odessa";
        String country = "Ukraine";
        System.out.println("country = " + country);
        System.out.println("city = " + city);
        System.out.println("name = " + name);


    }

}
