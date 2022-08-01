package week03;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 10;
        String eligibleOrNot;
        if (age >= 18){
            eligibleOrNot = "Eligible";
        }else{
            eligibleOrNot = "Not eligible";
        }
        System.out.println("eligibleOrNot for voting = " + eligibleOrNot);

    }
}
