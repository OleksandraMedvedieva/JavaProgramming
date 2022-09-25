package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");

        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");
        //  1. Update the "M" to Male and "F" to Female
        /*
        for (String key : employeeMap.keySet()) {
            if (employeeMap.get(key).equals("M")){
                employeeMap.replace(key,"Male");
            }
            if (employeeMap.get(key).equals("F")){
                employeeMap.replace(key,"Female");
            }

        }
         */

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equals("M")){
                //entry.setValue("Male");
                employeeMap.replace(entry.getKey(), "Male");
            }
            if(entry.getValue().equals("F")){
                entry.setValue("Female");
            }
        }

        //System.out.println("employeeMap = " + employeeMap);
        System.out.println(" ====================================================================================== ");

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equals("Female")){
                System.out.println("Name = " + entry.getKey());
            }
        }



    }
}
