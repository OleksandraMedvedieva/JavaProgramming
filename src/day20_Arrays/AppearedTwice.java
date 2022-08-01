package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'P', 'O','A','O','A','P' };

        for (int j = 0; j < chars.length; j++) {

            char ch = chars[j];
            int count = 0 ;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch){
                    count++;
                }
            }
            if (count == 2 ){
                System.out.println("ch = " + ch);
            }

        }





    }
}
