package week13;

public class Credentials {


    public String email = "oscar@cydeo.com";
    private String userName = "Scolfield";
    private String passWord = "Cydeo123";

    public String getUserName(String emailInput){
        if (emailInput.equalsIgnoreCase(email)){
            return this.userName;
        }
        return  "condition has NOT been satisfied";
    }
    public String getPassWord(String emailInput, String userNameInput){
        if (emailInput.equalsIgnoreCase(email)&&userNameInput.equalsIgnoreCase(userName)){
            return this.passWord;
        }
        return "condition has NOT been satisfied";
    }

    public void setPassWord(String newPassword){
        if (true){
            this.passWord = newPassword;
            //System.exit(-1);
        }
    }


}
