package day11_Switch_Scanner;

public class ConvertNumber {
    public static void main(String[] args) {
        int num =10; // 0~9
        String result = "";
        result = (num >=0 && num <=9) ?
                (num==0)? "Zero" :(num==1)? "One" :(num==2)? "Two" :(num==3)? "Three" :(num==4)? "Four" :(num==5)? "Five"
                :(num==6)? "Six" :(num==7)? "Seven" :(num==8)? "Eight" : "Nine"
                : "Invalid number";

        System.out.println(result);

    }
}
/*
2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */
