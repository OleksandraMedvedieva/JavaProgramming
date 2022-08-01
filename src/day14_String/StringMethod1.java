package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 = "    batch      25    ";
        str1 = str1.trim();
        System.out.println(str1);

        System.out.println("================================================");

        String str2= "Cydeo School";
        int n1 = str2.indexOf('h');
        System.out.println("n1 = " + n1);
        int n2 = str2.indexOf("ool"); // 9 - o
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("ang");
        System.out.println("n3 = " + n3);
        int n4 = str3.indexOf("g ");
        System.out.println("n4 = " + n4);
        int n5 = str3.lastIndexOf("g");
        System.out.println(n5);

        System.out.println("================================================");

        String s= "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a C");
        System.out.println("secondA = " + secondA);

        //int thirdA = s.indexOf("ava W");
        //int thirdA = s.lastIndexOf("av");
        int thirdA = s.indexOf("Ca")+ 1;
        System.out.println("thirdA = " + thirdA);

        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);

        int sixA = s.lastIndexOf("aw");
        System.out.println("sixA = " + sixA);
        int sevenA = s.lastIndexOf("a ");
        System.out.println("sevenA = " + sevenA);
        int eightA = s.lastIndexOf("a");
        System.out.println("eightA = " + eightA);








    }
}
