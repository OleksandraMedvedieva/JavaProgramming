package day23_CustomMethods_Void;

public class CustomMethodsWithParameter {

    public static void oddOrEven(int number){

        if(number%2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");

        }

    }

    public static void personAge(int birthYear){
        int age = 2022-birthYear;
        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) {
        oddOrEven(45);
        personAge(1993);
        numbersBetween(1,10);
    }

    public static void numbersBetween(int x, int y){
        for (int i = x; i < y+1 ; i++) {
            System.out.print(i + " ");
        }
    }

}
