package tests;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //Armstrong number is a number that is equal to the sum of cubes of its digits.
        // For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
    /*    int num =153;
        int temp = num;
        int lastDigit;
        int sum=0;

        while (temp>0){
            lastDigit=temp%10;
            sum+= lastDigit*lastDigit*lastDigit;
            temp=temp/10;
        }
        if (num==sum){
            System.out.println(num + " is armstrong number");
        }else{
            System.out.println(num + " is not an armstrong number");
        }*/

        int num =370;
        int temp = num;
        int sum = 0;
        int digit;

        while(temp>0){
            digit = temp%10;
            sum+= digit*digit*digit;
            temp=temp/10;
        }

        if (num==sum){
            System.out.println(num + " is armstrong");
        }else{
            System.out.println(num + " is not armstrong");
        }



    }
}
