package tests;

public class Prime_Number {
    public static void main(String[] args) {

        //Prime Number (a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11))
        int num = 4;
        int count =0;


        for (int i = 2; i<num; i++){
            if (num%i==0){
                count++;
            }
        }
        if (count>0){
            System.out.println(num + " NOT a prime number");
        }else{
            System.out.println(num + " is a prime number");
        }


    }
}
