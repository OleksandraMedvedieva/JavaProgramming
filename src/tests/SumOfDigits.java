package tests;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 234;
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num = num/10;
        }
        System.out.println("sum = " + sum);


    }
}
