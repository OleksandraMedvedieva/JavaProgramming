package week03;

public class IfConditions_Example {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 8;
        int num3 = 1;
        int maxNum;
         if (num1>num2 && num1>num3){
             maxNum = num1;
         }else if(num2>num1 && num2>num3){
             maxNum = num2;
        }else{
             maxNum = num3;
         }
        System.out.println("maxNum = " + maxNum);

    }
}
/*
Write Java program that will accept three numbers and return the greatest number.
• Input:
Enter first number: 4
Enter second number: 8
Enter third number: 1
• Output:
The greatest number is: 8
 */