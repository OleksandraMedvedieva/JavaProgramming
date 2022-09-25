package week18.polymorphismDemo;

public class ElementsTest {
    public static void main(String[] args) {

        Links links = new Links();
        links.click();
        System.out.println(links.getText());
        links.sendKeys("EU9");
        WebElementUtility.clickElement(links);
        InputFields inputFieldOne = new InputFields();
        WebElementUtility.clickElement(inputFieldOne);

        WebElement linksPoly = new Links();
        ((Links)linksPoly).getLink();


    }
}
