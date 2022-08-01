package day09_If_Statements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Mike",
                citizenship = "US";
        int age = 19;

        if (citizenship == "USA" && age>=18){
            System.out.println(name + " is eligible to vote.");
        }else{
            System.out.println(name + " is NOT eligible to vote.");
        }


    }


}
