package week17.interfaceDemo;

public class FirefoxDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("Firefox driver - navigating to: " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Firefox driver - locating element by locator: " + locator);
    }

    @Override
    public void quit() {
        System.out.println("Firefox driver quiting the driver");
    }

    @Override
    public String getTitle() {
        return "EU9 Test Automation";
    }

    public void someUniqueMethodForFirefox(){
        System.out.println("this method only belongs to Firefox");
    }


}
