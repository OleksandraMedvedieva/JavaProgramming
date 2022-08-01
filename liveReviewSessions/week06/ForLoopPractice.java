package week06;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <=1000 ; i+=+10) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("===============================");


            for (int i = 0; i <=1000 ; i++) {
                if (i%10==0)
                System.out.print(i + " ");
            }
        System.out.println();

        System.out.println("===============================");


            int x = 0; // initialization, x is not local
        for( ; x<=1000; ){
            if (x%10==0){
                System.out.print(x+ " ");
            }
            x++; // iteration

        }
        System.out.println();
        System.out.println("x = " + x);

        System.out.println("===============================");


        boolean check = true;
        for ( int i= 0;check; i+=10 ){

            System.out.print(i+ " ");
            if (i==1000){
                check = false;
            }
        }



    }
}


/*
Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000
 */