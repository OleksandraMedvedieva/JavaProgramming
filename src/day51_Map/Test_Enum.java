package day51_Map;

public class Test_Enum {
    public static void main(String[] args) {

        //String browser = "Wooden spoon";
        Browser browser = Browser.EDGE;

        switch (browser){
            case FIREFOX:
                System.out.println("firefox is selected");
                break;
            case SAFARI:
                System.out.println("safari is selected");
                break;
            case OPERA:
                System.out.println("opera is selected");
                break;
            case EDGE:
                System.out.println("edge is selected");
                break;
            default:
                System.out.println("chrome is selected");
        }



    }
}
