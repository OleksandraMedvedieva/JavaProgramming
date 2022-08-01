package day17_While_DoWHile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence = "cat dogcat dog dog CAT DOG doG";
        int result = 0;
        for (int i = 0; i <= sentence.length() -3; i++) {
            String eachSubsting = sentence.substring(i,i+3);
            if (eachSubsting.equalsIgnoreCase("cat")){
                result++;
            }

        }
        System.out.println(result);

    }
}

