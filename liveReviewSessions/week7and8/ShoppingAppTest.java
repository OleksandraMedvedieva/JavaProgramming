package week7and8;

public class ShoppingAppTest {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 13 case"};
        double[] prices = {99.99,350.50, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {124356,589463,152634,147852,368963,524163};

        for (int i = 0; i < itemIDs.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")){
                System.out.println ("Gloves found at index = " + i);
                break;
            }
        }
        for (int i = 0; i < itemIDs.length; i++) {
            if ( !(items[i].contains("J"))){
                System.out.println(items[i]);
            }

            }

        System.out.println("-----------------------------------------");
        boolean itemExist = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")) {
                itemExist = true;
                break;
            }
        }
        if (itemExist){
            System.out.println("We have ipad in the list");
        }





        }
    }

