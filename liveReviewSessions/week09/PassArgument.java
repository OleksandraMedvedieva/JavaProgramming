package week09;

public class PassArgument {
    public static void main(String[] args) {

        sum(12,34);

        int x = sum2(12,34);
        sum(x,5);

        double y = 3.3;
        sum((int)y,4);



    }

    public static void sum (int a,int b){
        System.out.println(a+b);
    }
    public static int sum2(int a,int b){
        return a+b;
    }

}
