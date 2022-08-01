package day08_IfStatement;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        int numberOfMonth = 4;
        boolean has28days = numberOfMonth == 2;
        boolean has30days = numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth == 9 || numberOfMonth == 11;
        boolean has31days = !has28days && !has30days; // if the month does not have 28 days and doest nkt have 30 days.

        if (has31days) {
            System.out.println("Month has 31 days");
        }
        if (has30days) {
            System.out.println("Month has 30 days");
        }
        if (has28days) {
        System.out.println("Month has 28 days");
    }

    }
}
/*
3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2

 */
