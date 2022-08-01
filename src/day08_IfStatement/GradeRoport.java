package day08_IfStatement;

public class GradeRoport {
    public static void main(String[] args) {

        int score= 85;

        if (score>=90 && score<=100) {
            System.out.println("Excellent");
        }
        if (score>=80 && score<90) {    
            System.out.println("Great");
        }
        if (score>=70 && score<80) {
            System.out.println("Good");
        }
        if (score>=60 && score<70) {
            System.out.println("Passed");
        }
        if (score>=0 && score<60) {
            System.out.println("Failed");

        }

    }

}

