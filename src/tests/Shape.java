package tests;

import java.text.DecimalFormat;
import java.util.*;

public  class Shape {

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,1,4,1,2,3,4,5,7,23,83));
        for (Integer num:list){
            set.add(num);
            if(num==7){
                set.add(null);
            }
        }
      /*  System.out.println("set = " + set);
        double c =113.12345566666;
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println(dc.format(c));*/

    }
    }


   

