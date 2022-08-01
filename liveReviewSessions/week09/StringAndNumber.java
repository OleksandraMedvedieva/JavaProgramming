package week09;

public class StringAndNumber {
    public static void main(String[] args) {

        stringTimes("Sasha", 4);


    }

    public static void stringTimes (String word, int times){
        for (int i = 0; i < times; i++) {
            System.out.print(word);
        }
    }
}

/*
Task 1 :    Write a method that accepts a string and a non-negative number,
                and prints a larger string that is number copies of the original String

                stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi
 */
