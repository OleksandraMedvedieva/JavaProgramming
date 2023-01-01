package tests;

public class ArmstrongNumber {
    public static void main(String[] args) {

        //Armstrong number is a number that is equal to the sum of cubes of its digits.
        // For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
        //153 = 1*1*1 (1) + 5*5*5 (125) + 3*3*3 (27)
        // 9474
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


        int num =54748;
        int numberCopy = num;
        int sum = 0;
        int digit;
        int numberOfDigits =0;  // numbers of digits
        int powNumber=1;        //  will contain a digit raised to a power

        while (numberCopy >0 ){ //  this loop calculate the number of digits of our number
             numberCopy=numberCopy/10;
             numberOfDigits++;
         }
        numberCopy = num;  //as the temp value was changed in the while loop we again reassign its value to a number

        while(numberCopy>0){
            digit = numberCopy%10;  // find last digit
            for (int i = 1; i <=numberOfDigits ; i++){
                powNumber*=digit;  //  we  calculate the number raised to a power based on numberOfDigits
            }
            sum+=  powNumber;
            numberCopy=numberCopy/10;
            powNumber=1; // power reassign to 1 for the next digit power raised calculation
        }

        if (num==sum){
            System.out.println(num + " is armstrong");
        }else{
            System.out.println(num + " is not armstrong");
        }


/*
        int num = 54748;
        int numberCopy = num;
        int sum = 0;
        int digit;
        int numberOfDigits =0;  // numbers of digits

        while (numberCopy >0 ){ //  this loop calculate the number of digits of our number
            numberCopy=numberCopy/10;
            numberOfDigits++;
        }
        numberCopy = num;  //as the temp value was changed in the while loop which is above we again reassign its value to a number

        while(numberCopy>0){
            digit = numberCopy%10;  // find last digit
            sum+=  Math.pow(digit,numberOfDigits);
            numberCopy=numberCopy/10;
        }

        if (num==sum){
            System.out.println(num + " is armstrong");
        }else{
            System.out.println(num + " is not armstrong");
        }

 */







    }
}
