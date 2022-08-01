package day24_CustomMethod_Return;

public class WarmupTasks {

    public static void main(String[] args) {
        personInitials("oleksandra", "medvedieva");
        emailDomain("sashazibit940@gmail.com");
        nameOfMonth(13);
        nameOfDay(3);
        daysInMonth(4);
        System.out.println("=============================================================================");
        String [] emails = {"john@gmail.com" , "Jimmy@yahoo.com", "Elmir@cydeo.com", "Gulnara@mail.ru"};
        for (String each : emails) {
            emailDomain(each);
        }


    }

    public static void personInitials(String firstName, String lastName ){
        String initials = firstName.substring(0,1) +"." + lastName.substring(0,1) + ".";
        System.out.println("Person initials are: " + initials.toUpperCase());
    }

    public static void daysInMonth(int numberOfMonth){
        String days = (numberOfMonth == 1 || numberOfMonth ==3 || numberOfMonth == 5 ||
                numberOfMonth == 7 || numberOfMonth == 8 || numberOfMonth == 10 || numberOfMonth == 12)? "31 days"
                :(numberOfMonth == 2) ? "28 or 29 days" : "30 days";
        System.out.println(numberOfMonth + " - this month has " + days);
    }

    public static void emailDomain (String email){
        String domain = email.substring(email.indexOf("@") +1, email.indexOf(".") ) ;
        System.out.println("The domain of email is: " + domain);
    }

    public static void nameOfMonth (int monthNumber){
        String monthName = (monthNumber == 12)? "December" :(monthNumber == 11)? "November" :(monthNumber == 10)? "October"
                :(monthNumber == 9)? "September" :(monthNumber == 8)? "August" :(monthNumber == 7)? "July" :(monthNumber == 6)? "June"
                :(monthNumber == 5)? "May" :(monthNumber == 4)? "April" :(monthNumber == 3)? "March" :(monthNumber == 2)? "February"
                :(monthNumber == 1)? "January" : "Incorrect month number";
        System.out.println("Name of the month is: " + monthName);

    }

    public static void nameOfDay (int dayNumber){
        String day = (dayNumber == 1)? "Monday" :(dayNumber == 2)? "Tuesday" :(dayNumber == 3)? "Wednesday"
                :(dayNumber == 4)? "Thursday" :(dayNumber == 5)? "Friday" :(dayNumber == 6)? "Saturday"
                :(dayNumber == 7)? "Sunday" : "Incorrect day number";
        System.out.println("Name of the day is: " + day);

    }



}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
 */
