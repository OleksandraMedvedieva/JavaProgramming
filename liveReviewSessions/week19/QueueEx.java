package week19;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;


public class QueueEx {
    public static void main(String[] args) {

       Queue<String> cities = new ArrayDeque<>();
       cities.addAll(Arrays.asList("Edirne", "Ankara", "Izmir","Tirana", "Chisinau"));
       while (cities.size()>0){
           System.out.println(cities.poll());
       }
        System.out.println("cities = " + cities);

    }
}
