package day24_CustomMethod_Return;

public class Return_vs_Exit {
    public static void main(String[] args) {

        nameOfMonth(15);
        System.out.println("Hello World");
    }

    public static void nameOfMonth (int monthNumber){

        if (monthNumber<1 || monthNumber>12){
            System.out.println("Invalid");
            //return; // exits the method nameOfMonth if condition is true
            System.exit(0); // exits the whole program
        }
        String monthName = (monthNumber == 12)? "December" :(monthNumber == 11)? "November" :(monthNumber == 10)? "October"
                :(monthNumber == 9)? "September" :(monthNumber == 8)? "August" :(monthNumber == 7)? "July" :(monthNumber == 6)? "June"
                :(monthNumber == 5)? "May" :(monthNumber == 4)? "April" :(monthNumber == 3)? "March" :(monthNumber == 2)? "February"
                : "January";
        System.out.println("Name of the month is: " + monthName);

    }
}
