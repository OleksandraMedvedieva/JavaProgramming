package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {
        int birthDay = 21,
                birthYear = 1993;
        String birthMonth = "June",
                name = "Oleksandra",
                book_name = "Hamlet";
        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + ".");

        System.out.println("My favourite book is \"" + book_name + "\".");
    }
}
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

 */