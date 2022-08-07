package avengers04_08;

public class CustomMethods {

    public static void main(String[] args) {
        int age1 = 10;
        if (age1 > 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        int age2 = 20;
        if (age2 > 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
        int age3 = 30;
        if (age3 > 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
        String result = "";
        result = isEligible(age1);
        System.out.println(result);


    }

    public static String isEligible(int age){
        return  (age>21)? "Eligible" : "Not eligible";
    }

}
