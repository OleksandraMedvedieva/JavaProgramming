package avengers04_08;

import java.util.ArrayList;
import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        String[] browserType = {"Chrome", "FireFox", "Safari"};
        String newBrowser1 = "Edge";
        String newBrowser2 = "Opera";
        browserType = addElement(browserType,newBrowser1);
        browserType = addElement(browserType,newBrowser2);
        System.out.println(Arrays.toString(browserType));
        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList("Chrome", "FireFox", "Safari"));
        arrList.add(newBrowser1);
        System.out.println(arrList);

    }

    public static String[] addElement(String[] arr, String element){
        String[] result = new String[arr.length+1];
        int i = 0;
        for (; i <arr.length; i++){
            result[i] = arr[i];
        }
        result[i] = element;
        return result;

    }




}
/*
Create a new method that adds element to an existing Array
    Method will accept a String Array, a String variable as parameter, Return Type should be a String Array
 */
