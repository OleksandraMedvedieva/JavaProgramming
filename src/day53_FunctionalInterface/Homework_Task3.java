package day53_FunctionalInterface;

import java.util.function.Predicate;

public class Homework_Task3 {
    public static void main(String[] args) {
        Predicate<String> containsDuplicateChars = s -> {
            String [] arr = s.split("");
            boolean result = false;
            for (String each : arr) {
                int count = 0;
                for (String each2 : arr) {
                    if (each.equalsIgnoreCase(each2)){
                        count++;
                    }
                }
                if (count>1){
                    result = true;
                    break;
                }
            }
            return result;

        };
        System.out.println("containsDuplicateChars.test(\"Anna\") = " + containsDuplicateChars.test("Log"));

        Predicate<String> strongPassword = p->{
            boolean res1 = false;

            if (p.length()>=8 || !p.contains(" ")){
                res1=true;
            }
            boolean res2 = false;
            char[] arr = p.toCharArray();
            for (char each : arr) {
                if(Character.isUpperCase(each)){
                    res2 = true;
                    break;
                }
            }
            boolean res3 = false;
            for (char each : arr) {
                if(Character.isLowerCase(each)){
                    res3 = true;
                    break;
                }
            }

            boolean res4 = false;
            for (char each : arr) {
                if(!Character.isLetterOrDigit(each)){
                    res4 = true;
                    break;
                }
            }
            boolean res5 = false;
            for (char each : arr) {
                if(Character.isDigit(each)){
                    res5 = true;
                    break;
                }
            }
            if (res1 && res2 && res3 && res4 && res5){
                return true;
            }else{
                return false;
            }

        };
        System.out.println("strongPassword.test(\"Sasha2021*\") = " + strongPassword.test("Sasha2021"));


    }
}

//3. Use Predicate Functional interface to:
//		3.1 Create a function that can verify if a string contains duplicated characters
//
//		3.2 Create a function that can verify if a password is a strong password. Characteristics
//		of strong passwords are:
//		        1 Password must be at least have 8 characters long, and should not contain space
//		        2 PassWord should at least contain one upper case letter
//		        3 PassWord should at least contain one lower case letter
//		        4 Password should at least contain one special characters
//		        5 Password should at least contain a digit
