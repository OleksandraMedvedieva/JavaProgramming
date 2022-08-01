package week7and8;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
String password = "";
        Random random = new Random();

       int randomIndex;

        for(int  i =0; i<8; i++){
            randomIndex = random.nextInt(source.length()); // generate random index numbers
            password+=source.charAt(randomIndex);
        }

        System.out.println("password = " + password);




    }
}
