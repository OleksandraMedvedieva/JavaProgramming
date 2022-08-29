package week17.interfaceDemo;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Chrome driver - navigating to: " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chrome driver - locating element by locator: " + locator);
    }

    @Override
    public void quit() {
        System.out.println("Chrome driver quiting the driver");
    }

    @Override
    public String getTitle() {
        return "EU9 Test Automation";
    }


    public void someUniqueMethodForChrome(){
        System.out.println("this method only belongs to chrome");
    }


}
