package week7and8;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aabbbcccdffe";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c=arr[i];
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (c ==arr[j]){
                    count++;
                }
            }
            
        }

    }
}
