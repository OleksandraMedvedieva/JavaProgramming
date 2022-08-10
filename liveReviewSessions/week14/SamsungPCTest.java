package week14;

public class SamsungPCTest {
    public static void main(String[] args) {
        TestCase samsung = new TestCase(new Browser("Chrome"), new OS("Mac"));
        samsung.navigateTo("https://www.demoblaze.com/index.html#");
        DemoBlazeTest demoBlazeTest = new DemoBlazeTest(new Browser("Chrome"),new OS("Mac"));
        demoBlazeTest.navigateTo("laptops");
        demoBlazeTest.shopFor("samsung PC");
    }
}
