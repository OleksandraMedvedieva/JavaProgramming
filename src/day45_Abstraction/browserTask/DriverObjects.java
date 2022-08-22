package day45_Abstraction.browserTask;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        EdgeDriver edgeDriver = new EdgeDriver();
        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        OperaDriver operaDriver = new OperaDriver();
        chromeDriver.findElement("div");
        edgeDriver.getTitle();
        fireFoxDriver.quit();
operaDriver.executeScript("sasha hello");
operaDriver.takeScreenShot();

    }
}
