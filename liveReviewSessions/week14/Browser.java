package week14;

public class Browser {

    private String browserType;


    public Browser(String browserType) {
        setBrowserType(browserType);
    }

    public Browser() {
    }

    public String getBrowserType() {
        return browserType;
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    public String toString() {
        return "Browser{" +
                "browserType='" + browserType + '\'' +
                '}';
    }
}
