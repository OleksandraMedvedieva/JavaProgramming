package day49_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,null));
        System.out.println("list = " + list);
        System.out.println(list.get(4));

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println("hashSet = " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null,null,null,null,null));
        System.out.println("linkedHashSet = " + linkedHashSet);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //treeSet.addAll(Arrays.asList(null,null,null,null,null));// NullPointerException
        System.out.println("treeSet = " + treeSet);


    }
}