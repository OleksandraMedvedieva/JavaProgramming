package day17_While_DoWHile.day26_CustomMethodsPractice;

public class UpperCaseVSLowerCase {
    public static void main(String[] args) {
        String str = "JAVA32 java";
        char[] arr = str.toCharArray();
        int upperCase = 0;
        int lowerCase = 0 ;
        boolean result = false;
        for (char each : arr) {
            if (Character.isUpperCase(each)) {
                upperCase++;
            }
            if (Character.isLowerCase(each)) {
                lowerCase++;
            }
            if (upperCase == lowerCase){
                result = true;
            }


        }
        System.out.println("result = " + result);


    }
}

/*
4. Write program that returns true if the total number of upper case characters
are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */
