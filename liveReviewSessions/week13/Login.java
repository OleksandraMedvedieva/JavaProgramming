package week13;

public class Login {
    public static void main(String[] args) {
        Credentials user = new Credentials();
        System.out.println("user.email: "+ user.email);
        System.out.println("user.getUserName(\"oscar@cydeo.com\") = " + user.getUserName("oscar@cydeo.com"));

        user.setPassWord("NewPasswordForOscar");
        System.out.println("password after change = " + user.getPassWord("oscar@cydeo.com", "Scolfield"));


    }
}
