package week18.polymorphismDemo;

public class WebElementUtility {
    public static void clickElement(WebElement element){
        System.out.println("Clicking on the Element ");
        element.click();
    }
    public static WebElement getLinkWithText(String text){
        System.out.println("Searching for a link with text " + text);
        return new Links();
    }
}
