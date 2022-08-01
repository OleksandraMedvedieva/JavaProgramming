package utilities;

public class MathUtility {

    // return the sum of two integers
    public static int sumOfTwo (int num1, int num2){
        return num1+num2;
    }

    // return the sum of two decimal numbers
    public static double sumOfTwo (double num1, double num2){
        return num1+num2;
    }

    // return the subtraction of two integers
    public static int subtractionOfTwo (int num1, int num2){
        return num1-num2;
    }

    // return the subtraction of two decimals
    public static double subtractionOfTwo (double num1, double num2){
        return num1-num2;
    }

    //return the multiplication of two integers
    public static int multiplicationOfTwo (int num1, int num2){
        return num1*num2;
    }

    //return the multiplication of two decimals
    public static double multiplicationOfTwo (double num1, double num2){
        return num1*num2;
    }

    // return the division result of two numbers
    public static double division (double num1, double num2){
        return num1/num2;
    }

    // check if an integer is even number, return boolean
    public static boolean isEven(int number){
        boolean result = false;
        if (number%2 == 0){
            result = true;
        }
        return result;
    }

    // check if an integer is odd number, return boolean
    public static boolean isOdd(int number){
        boolean result = false;
        if (number%2 != 0){
            result = true;
        }
        return result;
    }

    // return the maximum number between two integers
    public static int maxOfTwo (int num1, int num2){
        if (num1 >num2){
            return num1;
        }else{
            return num2;
        }
    }

    // return the maximum number between two decimal numbers
    public static double maxOfTwo (double num1, double num2){
        if (num1 >num2){
            return num1;
        }else{
            return num2;
        }
    }

    // return the minimum number between two integers
    public static int minOfTwo (int num1, int num2){
        if (num1 >num2){
            return num2;
        }else{
            return num1;
        }
    }

    //return the minimum number between two decimal numbers
    public static double minOfTwo (double num1, double num2){
        if (num1 >num2){
            return num2;
        }else{
            return num1;
        }
    }

    //return the square of an integer
    public static int square (int number){
        return number*number;
    }

    //return the square of a double
    public static double square (double number){
        return number*number;
    }

    // return the cube of an integer
    public static int kube (int number){
        return number*number*number;
    }

    // return the cube of a double
    public static double kube (double number){
        return number*number*number;
    }

}
