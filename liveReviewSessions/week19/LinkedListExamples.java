package week19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {
        List<Integer> linkList = new LinkedList<>();
        linkList.addAll(Arrays.asList(10,3,67,34,23,78));
        ((LinkedList<Integer>) linkList).addFirst(1);
        ((LinkedList<Integer>) linkList).addLast(100);
        System.out.println("linkList = " + linkList);
        int eachElement = 0;
        for (int i = 0; i < linkList.size(); i++) {
            eachElement = ((LinkedList<Integer>) linkList).poll();
            System.out.println("eachElement = " + eachElement);

        }
    }
}
