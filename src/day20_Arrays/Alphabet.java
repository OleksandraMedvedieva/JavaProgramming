package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] letters2 = new char[26]; // Z-A

        /*
        for (int i = 0, j = 'Z'; i <letters2.length; i++, j--) {  // i - index numbers from 0 - to the last index
            letters2[i] = (char)j;

        }

 */
        for (char i = 0, j = 'Z'; i <letters2.length ; i++, j--){
            letters2[i] = j;
        }


        System.out.println(Arrays.toString(letters2));
    }
}
