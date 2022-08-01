package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRates, weeklyHours

        int hourlyRates = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        int salary = hourlyRates * weeklyHours * numberOfWeeks;
        //System.out.println(salary);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRates = $" + hourlyRates);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);


    }
}

