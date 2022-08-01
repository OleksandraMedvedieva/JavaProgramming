package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {


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
