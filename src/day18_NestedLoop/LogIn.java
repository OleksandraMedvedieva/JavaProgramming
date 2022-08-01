package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your username");
        String u = input.next();
        System.out.println("Enter your password");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else{

            for (int i = 1; i <3 ; i++) {
                System.out.println("Incorrect user name or password. Please re-enter");
                System.out.println("Enter your username");
                u = input.next();
                System.out.println("Enter your password");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                    break;
                }
            }


            if( !(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.out.println("yur account is locked");
            }
            input.close();
        }




    }
}

/*
 2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts
                        to enter correct credentials and if all three attempts are failed, then print "Your account is locked."


 */
