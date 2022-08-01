package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {


        String str = "  CC ";
        boolean r = str.isEmpty();
        System.out.println("r = " + r);

        boolean r1 = str.isBlank();
        System.out.println("r1 = " + r1);

        System.out.println(" = = = = = = = = = = = = = = = = = = ");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(" = = = = = = = = = = = = = = = = = = ");

        String sentence = "My favourite programming language is Java";
        boolean hasJava1 = sentence.toLowerCase().contains("java");
        boolean hasCSharp =sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava1 = " + hasJava1);


        System.out.println(" = = = = = = = = = = = = = = = = = = ");

        String input1 = "I love jaVa";
        String input2 = "Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.contains(input2));
        System.out.println(input1.toLowerCase().contains(input2.toLowerCase()));

        System.out.println(" = = = = = = = = = = = = = = = = = = ");

        String a = "Wooden Spoon";
        System.out.println(a.startsWith("wooden"));
        System.out.println(a.toLowerCase().startsWith("wooden"));
        System.out.println(a);

        System.out.println(a.toLowerCase().endsWith("spoon"));





    }
}
