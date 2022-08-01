package week09;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int testNumber =153;
        System.out.println(isArmstrong(testNumber));



    }
    public static boolean isArmstrong (int number){
        boolean flag = false;
        int lastDigit = 0;
        int newNumber = 0;
        int oldNumber = number;
        while( number > 0 ){
            lastDigit = number%10;
            number /= 10;
            newNumber+= (lastDigit*lastDigit*lastDigit);
        }
        if (newNumber == oldNumber){
            flag = true;
        }


        return flag;
    }
}
/*

Task 4 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three
                and added to obtain a number. If the number obtained equals the original number then,
                we call that armstrong number.


                print all the armstrong numbers with three digit
                Armstrong numbers are     === 153 370 371 407 === for 3 digits

                 153   ==  (111)+(555)+(333)
                             1       125      27  == 153
 */
