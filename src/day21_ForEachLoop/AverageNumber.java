package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,67,89};
        int sum = 0;

        for (int number : numbers) {
            sum+=number;
        }
        double average = sum/numbers.length;
        System.out.println("average = " + average);
    }
}
