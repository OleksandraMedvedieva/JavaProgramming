package day51_Map;

import java.util.*;

public class Map_Iteration {
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();
        students.put("Aygun", 96);
        students.put("Maria", 86);
        students.put("Ali", 90);
        students.put("Alex", 85);
        students.put("Ozan", 74);
        students.put("Serkan", 74);
        students.put("Andriy", 65);
        /*
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
            //System.out.println(eachKey + ": " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey)+5);
        }


         */
        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90
        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >=90){
                earlyBirds.put(key,value);
            }else{
                angryBirds.put(key,value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);
        Set<String> names = students.keySet();

        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if(eachValue<90){
                System.out.println(eachKey);
            }

        }
        System.out.println("students = " + students);

        System.out.println("==========================================================================");

       // Collection<Integer> scores = students.values();
        List<Integer> scores = new ArrayList<>(students.values());
        System.out.println("scores = " + scores);

        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("==========================================================================");

        int maxScore =Integer.MIN_VALUE;

        for (Integer eachScore : students.values()) {
            if (eachScore>maxScore){
                maxScore = eachScore;
            }
        }
        System.out.println("maxScore = " + maxScore);

        int minScore = Integer.MAX_VALUE;
        for (Integer eachScore : students.values()) {
            if (eachScore<minScore){
                minScore = eachScore;
            }
        }
        System.out.println("minScore = " + minScore);

        System.out.println("==========================================================================");

        int max = Collections.max(students.values());
        System.out.println("max = " + max);
        int min = Collections.min(students.values());
        System.out.println("min = " + min);

        System.out.println("==========================================================================");

        int count = 0;
        /*
        for (Integer eachValue : students.values()) {
            if (eachValue>=95){
                count++;
            }
        }

         */
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore>=95){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("==========================================================================");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println("entry = " + entry);
            System.out.println(entry.getKey() + " : " +entry.getValue());
        }


    }
}
