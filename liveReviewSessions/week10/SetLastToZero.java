package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SetLastToZero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.set(list.size()-1, 0);
        System.out.println(list);

        System.out.println("----------------------------------------------------------------");

        swapper(list);
        System.out.println("list after swapper " + list);

        System.out.println("----------------------------------------------------------------");

        oddMultiplier(list);
        System.out.println("after oddMultiplier " + list);






    }

    public static ArrayList<Integer> swapper (ArrayList<Integer> arr){

        Collections.swap(arr,0,arr.size()-1);
        return arr;

    }

    public static ArrayList<Integer> oddMultiplier (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==1){
                list.set(i,list.get(i) *2);
            }
        }
        return list;

    }
}

/*
1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];
 */
