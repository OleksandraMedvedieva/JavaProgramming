package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(2,25);
        numbers.add(5,45);
        System.out.println(numbers);
        System.out.println(numbers.size());
        int lastIndex = numbers.size() -1;
        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);
        System.out.println("num = " + num);
        System.out.println("=======================================================");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i)  );
        }

        System.out.println("=======================================================");
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"JavaScript");
        list.set(3,"C++");
        System.out.println(list);


    }
}
