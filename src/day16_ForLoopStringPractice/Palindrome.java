package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Anna";
        String result = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i);
        }
        if (result.equalsIgnoreCase(word))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");

    }
}
