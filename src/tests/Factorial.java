package tests;

public class Factorial {
    public static void main(String[] args) {

        int num = 6; // 6!=6*(6-1)*(6-2)*(6-3)*(6-4)*(6-5)
        int res = 1;

        while(num>0){
          res*=(num--);
        }
        System.out.println("res = " + res);



    }
}
