package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {20,40,7,7,4,12,34,56,78};
        int max = numbers[0];

        for (int number : numbers) {
            if (number>max){
                max =number;
            }
        }
        System.out.println(max);
    }
}
