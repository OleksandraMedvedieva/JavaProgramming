package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator = '8';
        double n1 = 200.5,
                n2 = 2;
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';
        if (valid){
            switch (operator){
                case'+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);
            }

        }else{
            System.err.println("Invalid operator: "+ operator);
        }


    }



}
