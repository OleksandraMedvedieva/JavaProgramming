package day17_While_DoWHile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBCCCCC";
        String result = ""; // ABC

        for (int i = 0; i < str.length(); i++) {
           if (result.contains(str.charAt(i) + "")){
               continue;
           }
           result+="" + str.charAt(i);
        }

        System.out.println("result = " + result);




    }
}
