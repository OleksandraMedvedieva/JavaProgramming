package week14;

import java.util.Scanner;

public class ShopListMakerApp {

    public static Scanner scanner; // global variable of this class

    public static void main(String[] args) {
        GroceryList list = new GroceryList();


        printInstructions();
        //Scanner input = new Scanner(System.in);
        boolean toContinue = true;
        while(toContinue){
            System.out.println("Enter your next choice: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println("Enter your grocery item: ");
                    scanner.nextLine();
                    list.addItemToList(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Enter Item Number to be modified: ");
                    int itemNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new Item: ");
                    String newItem = scanner.nextLine();
                    list.modifyList(itemNumber, newItem);
                    break;
                case 4:
                    System.out.println("Enter the Item Number that will be removed: ");

                    list.removeItem(scanner.nextInt());
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Enter the Item name that you want to found: ");
                    String res = scanner.nextLine();
                    System.out.println(list.search(res));
                    break;
                case 6:
                    toContinue = false;
                    break;
            }
        }

    }

    public static void printInstructions(){
        scanner = new Scanner(System.in);
        System.out.println("Select : ");
        System.out.println("\t 0 - To print manu options");
        System.out.println("\t 1 - To print the List of Shopping Items.");
        System.out.println("\t 2 - To an Item in the List.");
        System.out.println("\t 3 - To update the items in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - Quite the app.");
    }



}
