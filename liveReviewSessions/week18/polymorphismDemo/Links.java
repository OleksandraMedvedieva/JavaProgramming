package week18.polymorphismDemo;

public class Links implements WebElement{

    @Override
    public void click() {
        System.out.println("Clicking th link");
    }

    public void getLink() {
        System.out.println("https//: some link ");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println("Unsupported Action");
    }

    @Override
    public String getText() {
        System.out.println("Getting link text");
        return "Oracle Java";
    }
}
