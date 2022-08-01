package day25_CusomMethod_Overloading;

import utilities.MathUtility;
import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str ="Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("----------------------------------------");

        System.out.println(StringUtility.reverse(str));

        System.out.println("----------------------------------------");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("----------------------------------------");

        String[] names = {"anna", "mom", "python", "java", "cydeo", "racecar", "listen",};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("----------------------------------------");
        String s2 = "aaaaassssssffffggggggggggggbbbbm";
        String noDup = StringUtility.removeDuplicates(s2);
        System.out.println("noDup = " + noDup);




    }
}
