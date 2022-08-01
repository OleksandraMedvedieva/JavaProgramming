package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        str= str.replace("Java", "Python");
        System.out.println("str = " + str);


        String email = "JohnSmoth@yahoo.com";
        email = email.replace("yahoo" , "gmail");
        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace(" Python", "");
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool.";
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);
        String s3 = "java";
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3);

        System.out.println("==================================================");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);
        String result2 = "C# is fun, C# is cool.";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String s4 = "Java";
        s4 = s4.replaceFirst("va", "ve");
        System.out.println("s4 = " + s4);







    }
}
