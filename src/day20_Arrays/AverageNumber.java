package day20_Arrays;


public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,67,89};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double averageNumber = (double)sum/ numbers.length;
        System.out.println("averageNumber = " + averageNumber);



    }
}


/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */