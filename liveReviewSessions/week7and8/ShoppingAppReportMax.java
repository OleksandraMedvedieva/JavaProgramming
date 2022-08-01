package week7and8;

public class ShoppingAppReportMax {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 13 case"};
        double[] prices = {99.99,350.50, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {124356,589463,152634,147852,368963,524163};

        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;
        int indexOfMinPrice = 0;
        double minPrice = prices[0];
        for (int i = 0; i<prices.length; i++ ){
            if (prices[i] >maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }

        System.out.println("maxPrice = " + maxPrice);
        System.out.println("minPrice = " + minPrice);

        System.out.println("itemID of MaxPrice item = " + itemIDs[indexOfMaxPrice]);
        System.out.println("itemID of MinPrice item = " + itemIDs[indexOfMinPrice]);
    }
}
