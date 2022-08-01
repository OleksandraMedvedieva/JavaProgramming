package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        int result = maxNumber(6,9) *2;
        System.out.println("result = " + result);

    }

    public static int maxNumber(int num1, int num2) {
        int max = num1;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }


}
