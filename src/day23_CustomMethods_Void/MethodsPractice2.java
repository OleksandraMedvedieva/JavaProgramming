package day23_CustomMethods_Void;

public class MethodsPractice2 {

    public static void helloWold5Times(){
        System.out.println("Hello World! \n".repeat(5));
    }
    public static void helloCydeo5Times(){
        System.out.println("Hello Cydeo! \n".repeat(5));
    }

    public static void evenNumbers(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        helloCydeo5Times();
        helloWold5Times();
        evenNumbers();

    }




}
