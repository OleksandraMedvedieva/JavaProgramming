package week7and8;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f','u','n'};

        for (char letter : letters) {
            System.out.print(letter+ " ");
        }
        System.out.println();
        String sentence = new String(letters);
        System.out.print("sentence = " + sentence);
        System.out.println();
        char[] newLetters = sentence.toCharArray();
        for (char newLetter : newLetters) {
            System.out.print(newLetter + " ");
        }
        System.out.println();

    }
}
