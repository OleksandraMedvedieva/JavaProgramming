package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {
    public static void main(String[] args) {

        Predicate<String> isPalindrome;
        isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return p.equalsIgnoreCase(reverse);
        };
        System.out.println("isPalindrome.test(\"Anna\") = " + isPalindrome.test("Anna"));

        Predicate<Integer> isEven;
        isEven = p->  p%2==0;
        System.out.println("=======================================================================");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,5,67,6,6,6,66,6,6,6,6,56,4,8,0,3,3,3,3,3,3,3));
        list.removeIf(isEven);
        System.out.println("list = " + list);
        System.out.println("=======================================================================");
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));
        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        System.out.println("=======================================================================");
        Consumer<String> printEach = (s)->{
            for (int i = 0 ; i <s.length() ; i++){
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Java");

        System.out.println("=======================================================================");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));
        /*
        for (Integer each : list2) {
            if(each%2 != 0){
                System.out.println(each);
            }
        }

         */
        list2.forEach(p -> {
            if (p%2!=0)
            System.out.println(p);
        });

        System.out.println("=======================================================================");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach (   p -> System.out.println(p.charAt(0)+"." + p.charAt(p.lastIndexOf(" ")+1)));

        System.out.println("=======================================================================");
        Function<int[], List<Integer>> convertToList =
                (arr) -> {
                    List<Integer> list4 = new ArrayList<>();
                    for (int each : arr) {
                        list4.add(each);
                    }
                    return list4;
                };
        int[] arr = {1,2,3,4,5,6};
        List<Integer> res = convertToList.apply(arr);
        System.out.println("res = " + res);
        System.out.println("=======================================================================");
        Function<List<Integer>,int[]> convertToArray =
                (p) ->{
            int[] result = new int[p.size()];
                    for (int i = 0; i < p.size(); i++) {
                        result[i] = p.get(i);
                    }
                    return result;
                };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int[] array = convertToArray.apply(numbers);
        System.out.println("=======================================================================");
        // create a function that can return the maximum number from an int array

        Function<int[], Integer> maxNumber =
                (ar) ->{
            Integer max = ar[0];
                    for (int each : ar) {
                        if (each>max){
                            max=each;
                        }
                    }
                    return max;
                };
        int[] arr1 = {1,2,3,4,5,6};
        System.out.println("maxNumber.apply(arr1) = " + maxNumber.apply(arr1));

        System.out.println("=======================================================================");
        // create a function that can swap the first and last elements of an array
        Function<int[], int[]> swapElements =
                (a) -> {
                    int temp = a[0];
                    a[0] = a[a.length - 1];
                    a[a.length - 1] = temp;
                    return a;

                };
        int[] arr2 = {1,2,3,4,5,6};

        int[] arr3 =swapElements.apply(arr2);
        System.out.println(Arrays.toString(arr3));
        System.out.println("=======================================================================");
        // Create a function that can reverse an array and returns it
        Function<int[], int[]> reverseArr =
                (r) -> {
                    int[] r1 = new int[r.length];
                    for (int i = r.length - 1, j = 0; i >= 0; i--, j++) {
                        r1[j] = r[i];
                    }
                    return r1;

                };

        int[] arr4 = {1,2,3,4,5,6};
        int[] arr5 = reverseArr.apply(arr4);
        System.out.println(Arrays.toString(arr5));

        System.out.println("=======================================================================");
        // create a function that can reverse a List
        Function<List<Integer>, List<Integer>> reverseList =
                (l) -> {
                    Collections.reverse(l);
                    return l;
                };
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("reverseList.apply(numbers1) = " + reverseList.apply(numbers1));


    }
}
