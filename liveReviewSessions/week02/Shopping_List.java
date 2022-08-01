package week02;

public class Shopping_List {

    public static void main(String[] args) {

        String item1, item2, item3, report;
        Double price1, price2, price3, totalPrice;
        item1 = "Tomatoes";
        item2 = "Cheese";
        item3 = "Apples";

        price1 = 5.5;
        price2 = 3.5;
        price3 = 6.3;
        totalPrice = price1 + price2 + price3;

        report = "Item1: " +item1+" Price: "+  price1+ ", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3+"\n"+
                "Total price: "+totalPrice;

        System.out.println(report);
    }

}

/*
    In this assignment you will write a program to create a shopping list and prices.

Enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables /*
    In this assignment you will write a program to create a shopping list and prices.

Enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
     */
