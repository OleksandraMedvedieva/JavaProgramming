package week19;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        ArrayList<String>  arrayList = new ArrayList<>();
        stringList = new Stack<>();
        stringList.add("Yasar");
        stringList.add("Mickey");
        stringList.addAll(Arrays.asList("Yasar","Omer", "Maya", "Kamuran","Nermin", "Jamal", null, null,null));
        System.out.println("stringList = " + stringList);
        System.out.println(stringList.get(3));
        System.out.println(((Stack)stringList).peek());
        ((Stack)stringList).pop();
        ((Stack)stringList).pop();
        ((Stack)stringList).pop();
        System.out.println("stringList = " + stringList);
        ((Stack)stringList).push("Oscar");
        System.out.println("stringList = " + stringList);
        ((Stack)stringList).pop();
        System.out.println("stringList = " + stringList);
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);

    }
}
