package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;
        printEach = s-> {
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };
        printEach.test("java");

        MySecondFunctionalInterface<Integer> cube;
        cube = n-> {
            System.out.println(n*n*n);
        };



    }
}
