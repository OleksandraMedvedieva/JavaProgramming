package week16;

import java.util.ArrayList;

class Test{
 void method(){
     System.out.println("Hello");
 }
}

public class FinalKeyword extends Test{

    final int y;
    final static int z;
    public FinalKeyword(){
        y = 5;
    }
    static{
        z = 10;
    }

    void  method(){
        System.out.println("Override parent method");
    }

    public static void main(String[] args) {
        final int x = 5; // local
        System.out.println();

        final int[] nums = {1,2,3};
        System.out.println(nums[0]);
        nums[0] = 5;
        System.out.println(nums[0]);
        //nums = new int[]{5,6,7};
        final ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("white");
        colors.remove(0);
       // colors = new ArrayList<>();


    }
}
