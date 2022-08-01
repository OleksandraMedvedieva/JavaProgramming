package day09_If_Statements;

public class Positive_Negative_Zero {

    public static void main(String[] args) {

        int number = 0;

        if(number>0){
            System.out.println(number + " is positive number");
        }else if (number<0){
            System.out.println(number + " is negative number");
        }else {
            System.out.println(number + " number is zero");
        }

    }


}
