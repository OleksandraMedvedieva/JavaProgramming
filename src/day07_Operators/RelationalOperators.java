package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result1 = 20 > 40;
        System.out.println("result = " + result1);

        boolean result2 = 20 < 40;
        System.out.println("result2 = " + result2);

        boolean result3 = 20 >= 20;
        System.out.println("result3 = " + result3);

        boolean result4 = 40 <= 40;
        System.out.println("result4 = " + result4);

        // credit score of $720

        int credit_score = 600;
        boolean isEligibleForLoan = credit_score >=720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        int score = 60;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);


        boolean result7 = 45 <= 60;
        System.out.println("result7 = " + result7);

        System.out.println("============================================================");

        // == equal

        int x = 100;
        int y = 200;
        boolean equal = x == y ; // 100 == 200 ===> false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; // false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; // false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; // true
        System.out.println("result10 = " + result10);

        System.out.println("============================================================");

        //  != not equal

        boolean result11 = 100 != 200; // true
        System.out.println("result11 = " + result11);
        boolean result12 = 100 != 100; //false
        System.out.println("result12 = " + result12);
        boolean result13 = "Java" != "Break"; // true
        System.out.println("result13 = " + result13);


    }
}
