package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Homework_StreamTasks {
    public static void main(String[] args) {
        //1. Write a program that can remove the duplicated elements of an array of String
        String[] arr= {"Apple", "Orange", "Orange", "Lime", "Watermelon", "Pie", "Apple"};
        System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));

        //	2. Write a program that can remove the duplicated elements of a List of String
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Orange", "Orange", "Lime", "Watermelon", "Pie", "Apple"));
        list= list.stream().distinct().collect(Collectors.toList());
        System.out.println("list = " + list);

        //	3. Write a program that can count how many "java" and "python" does the array has:
        //			ex: array = {"Java", "jAVa", "pythON"}
        //			output:
        //				countJava = 2
        //				countPython = 1
        String[] array = {"Java", "jAVa", "pythON"};
        long countJava = Arrays.stream(array).filter(p-> p.equalsIgnoreCase("java")).count();
        long countPython = Arrays.stream(array).filter(p-> p.equalsIgnoreCase("python")).count();
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

        //	4.4 Write a program that can count how many negative numbers does the array has
        //		ex: arr = {1,2,3,4,-4,5,-5}
        //		output:
        //			2
        Integer[] arr1 = {1,2,3,4,-4,5,-5};
        long num = Arrays.stream(arr1).filter(p-> p<0).count();
        System.out.println("num = " + num);

        //	4.4 Write a program that can count how many Positive numbers does the List has
        //		ex: List = {1,2,3,4,-4,5,-5}
        //		output:
        //			5
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5));
        long num2 = list2.stream().filter(p-> p>=0).count();
        System.out.println("num2 = " + num2);

        //	4. Wirte a program that can return all the negative numbers of the array as a new array
        //		ex:
        //			arr = {1,2,3,4,-4,5,-5}
        //		output:
        //			{-4, -5}
        int[] arr2 = {1,2,3,4,-4,5,-5};
        arr2 = Arrays.stream(arr2).filter(p-> p<0).toArray();
        System.out.println(Arrays.toString(arr2));

        //	4. Wirte a program that can return all the positive numbers of List without the duplcaites
        //		ex:
        //			list = {1,2,3,4,-4,5,-5,1,2,3,4}
        //		output:
        //			{1,2,3,4,5}
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5,1,2,3,4));
        list3 = list3.stream().distinct().filter(p-> p>=0).collect(Collectors.toList());
        System.out.println("list3 = " + list3);

        //	5. Wirte a program that can return the palindrome Strings from a list:
        //		Ex:
        //			list = {"Java", "level", "Anna", "Wooden Spoon"};
        //		output:
        //			{"level", "Anna"}
        List<String> list4 = new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"));
        list4= list4.stream().filter(p->{
            String reverse = new StringBuilder(p).reverse().toString();
            return p.equalsIgnoreCase(reverse);
        }).collect(Collectors.toList());
        System.out.println("list4 = " + list4);

        //	6. Write a program that can returun the unique elements of an array as a new array:
        //		Ex: arr = {1,1,2,3,3,4,5,5,6};
        //		output:
        //			{2,4,6}



        /*
        List<Integer> l = new ArrayList<>();
        l.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6));
        arr4 = Arrays.stream(arr4).filter(p-> Collections.frequency(l,p)==1).toArray();
        System.out.println(Arrays.toString(arr4));
         */
        Integer[] arr4 = {1,1,2,3,3,4,5,5,6};
        List<Integer> list5 = new ArrayList<>();
        for (int each : arr4) {
            list5.add(each);
        }
        System.out.println(Arrays.toString(list5.stream().filter(p-> Collections.frequency(list5,p)==1).toArray()));





    }
}
