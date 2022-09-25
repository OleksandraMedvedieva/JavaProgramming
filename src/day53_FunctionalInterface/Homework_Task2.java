package day53_FunctionalInterface;

public class Homework_Task2 {
    public static void main(String[] args) {


//		2.1 Create a function that can return the maximum number from an array of Integers

        ArrayFunction<Integer[],Integer> maxNumOfArr = p->{
            int max = p[0];
            for (Integer each : p) {
                if (each>max){
                    max=each;
                }
            }
            return max;
        };
        Integer[] arr = {12,23,45,65,76,34,12,97,123,-98,0,56};
        System.out.println("maxNumOfArr.apply(arr) = " + maxNumOfArr.apply(arr));

//		1.2 Create a function that can return the minimum number from an array of Integers
        ArrayFunction<Integer[],Integer> minNumOfArr = p->{
            int min = p[0];
            for (Integer each : p) {
                if (each<min){
                    min=each;
                }
            }
            return min;
        };
        System.out.println("minNumOfArr.apply(arr) = " + minNumOfArr.apply(arr));

//		1.3 Create a function that can return the longest String from an array of String
        ArrayFunction<String[],String> longestStr = s->{
            int maxL = 0;
            String res = "";
            for (String each : s) {
                if (each.length()>maxL){
                    maxL=each.length();
                    res = each;
                }
            }
            return res;
        };
        String[] arr2 = {"Apple","Orange","Lime","Watermelon","Pie"};
        System.out.println("longestStr.apply(arr2) = " + longestStr.apply(arr2));

//		1.4 Create a function that can return the shortest String from an array of String
        ArrayFunction<String[],String> shortestStr = s->{
            int minL = Integer.MAX_VALUE;
            String res = "";
            for (String each : s) {
                if (each.length()<minL){
                    minL=each.length();
                    res = each;
                }
            }
            return res;
        };
        System.out.println("shortestStr.apply(arr2) = " + shortestStr.apply(arr2));


    }
}
