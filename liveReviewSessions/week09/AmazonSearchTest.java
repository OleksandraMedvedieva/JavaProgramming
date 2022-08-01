package week09;

public class AmazonSearchTest {
    public static void main(String[] args) {

        System.out.println("---Starting Amazon Search Smoke Test---");
        SearchTest.openBrowser("Firefox");
        SearchTest.navigateToUrl("https://www.amazon.com/");
        System.out.println(SearchTest.searchForItem("Java"));
         if (!SearchTest.verifyResultsAreDisplayed("Java")){
             System.out.println("Test passed");
         }else{
             System.out.println("Test failed");
         }

         


    }
}
