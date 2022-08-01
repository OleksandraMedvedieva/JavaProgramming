package week03;

public class SmallConditionalTasks {
    public static void main(String[] args) {

        int x;
        int y = 20;
        //if (y ==20){
        //    x =5;
       // }else{
       //  x = 0;
       // }
        //System.out.println("x = " + x);

        boolean b = y==20;
        if (b){
            x = 5;
        }else{
            x = 0;
        }
        System.out.println("x = " + x);

        System.out.println("================");
        char ch1 = 'A';
        char ch2 = 'D';
        if (ch1>ch2){
            System.out.println("first character comes before second one");
        }else{
            System.out.println("second character comes before first one");
        }


    }
}
