package week04;

import java.util.Scanner;

public class AdaireAparttmants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which floor are you leaving?");
        int floornumber = input.nextInt();
        if (floornumber == 1){
            System.out.println("you are leaving at  the first floor");
        } else if (floornumber == 2) {
            System.out.println("you are leaving at  the second floor");
        } else if (floornumber == 3) {
            System.out.println("you are leaving at  the third floor");

        }else {
            System.err.println("there is no such floor");
        }
        switch (floornumber){
            case 1:
                System.out.println("you are leaving at  the first floor");
                break;
            case 2:
                System.out.println("you are leaving at  the second floor");
                break;
            case 3:
                System.out.println("you are leaving at  the third floor");
                break;
            default:
                System.out.println("you are leaving at  the third floor");
        }

        input.close();
    }



}
