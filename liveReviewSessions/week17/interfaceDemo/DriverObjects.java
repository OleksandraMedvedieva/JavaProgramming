package week17.interfaceDemo;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();
        //Polymorphism
        WebDriver driverSuper = new ChromeDriver();
        //WebDriver driverSuper1 = new FirefoxDriver();

        driver1.get("cydeo.com");
        driver1.someUniqueMethodForChrome();
        driver2.get("cydeo.com");
        driver2.someUniqueMethodForFirefox();

        driverSuper.get("cydeo.com");
        driverSuper = new FirefoxDriver();
        driverSuper.get("cydeo.com");
        ((FirefoxDriver) driverSuper).someUniqueMethodForFirefox();



    }
}
