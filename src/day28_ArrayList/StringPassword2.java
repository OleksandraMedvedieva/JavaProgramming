package day28_ArrayList;

public class StringPassword2 {
    public static void main(String[] args) {
        String password = "asha123&";

        int countUppercase =0;
        int countLowercase = 0;
        int countDigits = 0;
        int countSpecialChars = 0 ;
        boolean isStrongPassword = false;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUppercase++;
            }else if (Character.isLowerCase(each)){
                countLowercase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChars++;
            }
        }

        if (password.length() >=8 && !password.contains(" ") && countUppercase > 0 &&
                countLowercase>0 && countDigits>0 && countSpecialChars>0 ){
            isStrongPassword = true;
        }
        System.out.println("isStrongPassword = " + isStrongPassword);


    }
}
