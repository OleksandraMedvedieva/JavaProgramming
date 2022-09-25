package tests;

public class ReverseStr {
    public static void main(String[] args) {

        String str = "java java python ruby c++ c++ java hello";
        String word = "java";
        int count=0;
        while(str.contains(word)){
            str = str.replaceFirst(word,"");
            count++;
        }
        System.out.println("count = " + count);


    }
}
