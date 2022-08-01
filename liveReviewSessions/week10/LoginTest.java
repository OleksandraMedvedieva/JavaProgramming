package week10;

public class LoginTest {
    public static void main(String[] args) {

    }

    public static boolean login (String username, String password){
        if (username.equalsIgnoreCase("cydeoStudent") &&
        password.equalsIgnoreCase("cydeoPassword")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean login (){

        if (getUsername().equalsIgnoreCase("cydeoStudent") &&
                getPassword().equalsIgnoreCase("cydeoPassword")){
            return true;
        }else{
            return false;
        }
        }

    public static String getPassword(){
        return "cydeoPassword";
    }

    public static String getUsername(){
        return "cydeoStudent";
    }







}





