package day01_JavaIntro.week05;

public class StringMethods {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'b';

        String str = ch1+ "" + ch2;


        String searchResultNew = " username:oscar  search result count!: 12345 more column : more information, result ";

    /*
    we will use overloaded method of indexOf()
     */
        int firstColumnIndex = searchResultNew.indexOf(':');
        System.out.println("firstColumnIndex = " + firstColumnIndex);
        int secondColumnIndex = searchResultNew.indexOf(':',firstColumnIndex+1); // search starts from index 10

        //int thirdColumnIndex = searchResultNew.indexOf('!', 15);
        int thirdColumnIndex = searchResultNew.indexOf("result", 31);
        System.out.println("thirdColumnIndex = " + thirdColumnIndex);



    }

}
