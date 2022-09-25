package day53_FunctionalInterface;

public class Test {
    public static void main(String[] args) {
//1. Create a function that takes one integer and returns the cube of the given argument
        MyThirdFunctionalInterface<Integer> cube;
        cube =  n -> {
            return (n * n * n);
        };
        System.out.println("cube.method(3) = " + cube.method(3));

        //2. Create a function that takes a String and returns the reversed value of the given argument

        MyThirdFunctionalInterface<String> reverseStr;
        reverseStr = str -> {
            String result = "";
            for (int i = str.length()-1 ; i >=0; i--){
                result+=str.charAt(i);
            }
            return result;
        };
        System.out.println("reverseStr.method(\"java\") = " + reverseStr.method("java"));


    }
}
/*
2.1 Create a class named Test and use the custom functional interface above to create the following functions:
				1. Create a function that takes one integer and returns the cube of the given argument
				2. Create a function that takes a String and returns the reversed value of the given argument
 */
