package day09_If_Statements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2001;
        boolean leap_year = year%4 ==0;
        if (leap_year){
            System.out.println("Year " + year + " is leap year");
        }else{
            System.out.println("Year " + year + " is not a leap year");
        }


    }


}
