package day17_While_DoWHile.day26_CustomMethodsPractice;

import java.util.Arrays;

public class RetrieveDigitsLetterSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon 32 !";
        char[] arr = str.toCharArray();
        String letters= "";
        String digits = "";
        String specialChars = "";

        for (char each : arr) {
            if (Character.isDigit(each)){
                digits+=each;
            }else if (Character.isLetter(each)){
                letters+=each;
            }else{
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);


    }
}

/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */
