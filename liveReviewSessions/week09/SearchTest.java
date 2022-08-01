package week09;

public class SearchTest {
    public static void main(String[] args) {

        System.out.println("---Starting Etsy Search Smoke Test---");
        //step 1 - open browser
        openBrowser("Chrome");
        // step 2 - navigate to app
        navigateToUrl("https://www.etsy.com/");
        // step 3 - send search item
        System.out.println(searchForItem("wooden spoon"));
         if (!verifyResultsAreDisplayed("wooden spoon")){
             System.out.println("Search Test for Etsy PASSED");
         }else{
             System.out.println("Search Test for Etsy FAILED");
         }


    }
    public static void openBrowser(String browser){
        System.out.println("Launching " + browser + " browser");
    }
    public static void navigateToUrl (String url){
        System.out.println("Navigating to URL " +url);
    }
    public static String searchForItem (String item){
        String searchResult = "15,811 results for " + item;
        return searchResult;
    }
    public static boolean verifyResultsAreDisplayed(String item){
        return searchForItem(item).isEmpty();
    }

}
