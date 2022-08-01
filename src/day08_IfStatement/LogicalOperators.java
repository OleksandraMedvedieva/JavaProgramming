package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        int age = 14;
        String citizen = "USA",
                name = "Mark";
        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("======================================================");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 23;
        int income = 60000;
        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligible fro loan: " + isEligible2);

        System.out.println("======================================================");

        String name3 = "Oskar";
        int age3 = 21;
        char gender = 'M';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("======================================================");

        String name4 = "Oleksandra";
        String countryOfBirth = "Ukraine";
        boolean marriedToUSCitizen = true;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to apply for US citizenShip: " + isEligible4);

        System.out.println("======================================================");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <=60000;
        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        System.out.println("======================================================");
        boolean result2 = true;
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("======================================================");

        int score= 85;
        boolean pass= score >=60;
        boolean failed = !pass;
        System.out.println("passed: " + pass);
        System.out.println("failed: " + failed);



    }

}
