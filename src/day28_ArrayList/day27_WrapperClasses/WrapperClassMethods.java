package day28_ArrayList.day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "12345";
        int num = Integer.parseInt(str);
        System.out.println(num+1);
        System.out.println(str + 1);
        String str2 = "10.4";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 10);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        String s1 = "True";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println("b1 = " + b1);

        System.out.println("---------------------------------------------");
        String s2 = "123";
        Integer x = Integer.valueOf(s2);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);
        System.out.println(z);

        System.out.println("---------------------------------------------");

        char ch1 = '0';
        char ch2 = 'a';
        boolean r2 = Character.isDigit(ch1);
        System.out.println("r2 = " + r2);
        boolean r3 = Character.isLetter(ch2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------------------------------");
        String s = "sd4skssk62aaa3cccc34";
        int sum = 0;
        for (char each : s.toCharArray()) {

            if (Character.isDigit(each)){
                sum+= Integer.parseInt(each + "");
            }

        }
        System.out.println("sum = " + sum);



    }
}
