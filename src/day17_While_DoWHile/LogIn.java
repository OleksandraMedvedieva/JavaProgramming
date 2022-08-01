package day17_While_DoWHile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter user name");
        String username = input.next();
        System.out.println("Enter password");
        String password = input.next();


        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in.");
        }else{
            int attempts = 3;
            while( !(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts>0 ){
                if (attempts==1){
                    System.err.println("THIS IS your last attempt");
                }
                System.err.println("Incorrect user name/password. Re-enter.");
                System.out.println("Enter user name");
                username = input.next();
                System.out.println("Enter password");
                password = input.next();
                attempts--;
            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in.");
            }else{
                System.out.println("Account Locked");
            }
        }


       input.close();



    }
}


/*
 2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}

 */
