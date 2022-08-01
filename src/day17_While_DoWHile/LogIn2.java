package day17_While_DoWHile;

public class LogIn2 {
    public static void main(String[] args) {
        String u = "Cydeo";
        String p = "Cydeo123";

        for (int i = 1; i <=3 ; i++) {
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged in");
                break;
            }
            if (i==3){
                System.out.println("Your account is locked");
            }

        }
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
