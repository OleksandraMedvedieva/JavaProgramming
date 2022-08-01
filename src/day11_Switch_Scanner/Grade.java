package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch = 'l';
        String result;
        switch (ch){
            case 'A':
                result ="excellent";
                break;
            case 'B':
                result ="great job";
                break;
            case 'C':
                result ="good";
                break;
            case 'D':
                result ="passed";
                break;
            case 'F':
                result ="failed";
                break;
            default:
                result ="invalid";
        }
        System.out.println("result = " + result);


    }
}
/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */
