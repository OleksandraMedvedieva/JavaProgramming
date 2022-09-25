package day51_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();
        students.put("Oscar", 96);
        students.put("Maria", 86);
        students.put("Ali", 90);
        students.put("Andriy", 65);
        students.put("Alex", 85);
        students.put("Serkan", 74);
        students.put("Alex", 85);
        students.put("Alex", 86);
        students.put("Alex", 87);
        System.out.println("students = " + students);
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));
        System.out.println("students.size() = " + students.size());
        students.replace("Ali",100);
        System.out.println("students = " + students);
        students.remove("Serkan");
        System.out.println("students = " + students);
        System.out.println("students.containsKey(\"Sasha\") = " + students.containsKey("Sasha"));
        System.out.println("students.containsKey(\"Maria\") = " + students.containsKey("Maria"));

        System.out.println("students.containsValue(\"55\") = " + students.containsValue(55));
        System.out.println("students.containsValue(100) = " + students.containsValue(100));
        System.out.println("==================================================");

        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String,Integer> map2 = new HashMap<>();
        map2.putAll(students);
        System.out.println(map1==map2);
        System.out.println("map1.equals(map2) = " + map1.equals(map2));
        map2.clear();
        map1.clear();
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println("==================================================");




    }
}
