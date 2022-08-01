package day19_LoopPractices;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result="";
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each){
                    count ++;
                }
            }
            if (result.contains(ch+"")){
                continue;
            }
            result+= "" + ch + count;

        }


        System.out.println("result = " + result);

    }



}


/*
Tasks:
	1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
