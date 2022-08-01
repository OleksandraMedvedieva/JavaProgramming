package day20_Arrays;

public class MaxNumOfArray {
    public static void main(String[] args) {
        
        int[] numbers = {20,40,7,7,4,12,34,56,78};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);
        
        
        
    }
}
