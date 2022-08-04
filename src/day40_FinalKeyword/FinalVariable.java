package day40_FinalKeyword;

public class FinalVariable {

    final char gender;
    final static String name;
    static{
        name = "Batch 25";
    }

    public FinalVariable(char gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
         // pi = 4; can to be reassigned
        final String name ;
        name = "Java";
        // name = "WoodenSpoon"; can to be reassigned
        System.out.println(name);

        System.out.println("---------------------------------");
        FinalVariable obj = new FinalVariable('F');
        // obj.gender = 'M'; can to be reassigned
        System.out.println(obj.gender);
        FinalVariable obj2 = new FinalVariable('m');
        System.out.println(obj2.gender);

        System.out.println("---------------------------------");
        System.out.println(FinalVariable.name);


    }
}
