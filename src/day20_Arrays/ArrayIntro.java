package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String [] myGroup = new String [5];
        // System.out.println( myGroup ); // =>  [Ljava.lang.String;@7c30a502    -  hashcode

        myGroup[0] = "Sasha";
        myGroup[1] = "Natalia";
        myGroup[2] = "Maya";
        myGroup[3] = "Efe";
        myGroup[4] = "Bogdan";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String[] days ={ "Monday" ,"Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index:           0          1          2           3           4         5           6
        System.out.println(Arrays.toString(days));

        int number = 1;

        if(number>7 || number<1){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String[] month ={ "January" ,"February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int num = 6;

        if(num>12 || number<1){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(month[num-1]);





    }
}
