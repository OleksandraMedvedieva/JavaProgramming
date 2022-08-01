package day08_IfStatement;

import com.sun.security.jgss.GSSUtil;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {
        int number = 301;

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = number%2 != 0;

        if (evenNumber){
            System.out.println(number + " is even number.");
        }

        if (!evenNumber){ // not even number
            System.out.println(number + " is odd number");
        }

        System.out.println("=======================================");

        int n = 15;

        if (n>0){
            System.out.println(n + " is positive number.");
        }

        if (n<0){
            System.out.println(n + " is negative number.");
        }

        if (n==0){
            System.out.println(n + " is zero.");
        }

        System.out.println("=======================================");




    }
}
