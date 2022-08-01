package day16_ForLoopStringPractice;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "ASSSddddddoooolpanbvf";
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i <= word.length()-1; i++) {
            if (!result.contains((word.charAt(i) + "")))
            result+=word.charAt(i);
        }
        System.out.println("result = " + result);
        }


    }



/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */
