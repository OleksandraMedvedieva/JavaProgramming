package day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "Java";
        reverse(str);
        String result = reverse(str);
        System.out.println(result);
        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }


}
