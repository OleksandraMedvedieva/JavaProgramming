package day10_NestedIf;

public class TernariesGradeReport {
    public static void main(String[] args) {
        int score = 180;
        String grade = ""; // temporary
        String grade2 = "";
        grade = (score >= 0 && score <= 100)? (score >= 90)? "Excellent" :(score >=80)? "Great" :(score >= 70)? "Good"
               :(score >= 60)? "Passed" : "Failed" : "Invalid score";

        System.out.println(grade);

        System.out.println("=============================================");

        if (score >= 0 && score <= 100){
            grade2 = (score >= 90)? "Excellent" :(score >=80)? "Great" :(score >= 70)? "Good"
                    :(score >= 60)? "Passed" : "Failed";
        }else{
            grade2 = "Invalid score";
        }
        System.out.println(grade2);





    }




}

/*
        int score = 190;
        String grade = ""; // temporary

        if (score >= 0 && score <= 100){
            if (score >= 90){
                grade = "Excellent";
            }else if(score >=80){
                grade = "Great";
            }else if (score >= 70){
                grade = "Good";
            }else if (score >= 60){
                grade = "Passed";
            }else{
                grade = "Failed";
            }
        }else{
            grade = "Invalid score";
        }

        System.out.println(grade);


    }


}
 */


