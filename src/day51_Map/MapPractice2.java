package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>maxSalary){
                maxSalary = entry.getValue();
                name1 = entry.getKey();
            }
            if (entry.getValue()<minSalary){
                minSalary = entry.getValue();
                name2 = entry.getKey();
            }
        }
        System.out.println("maxSalary has " + name1);
        System.out.println("minSalary has " + name2);

        //how many employees has the salary between 120k ~ 150K?

        int count = 0;

        for (Integer each : map.values()) {
            if (each >=120000 && each<=150000){
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("----------------------------------------------");

        //   1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<118000){
                System.out.println(entry.getKey());
            }
        }
        System.out.println("----------------------------------------------");

        // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<120000){
                entry.setValue(entry.getValue()+10000);
            }
        }
        System.out.println("map = " + map);


    }
}
