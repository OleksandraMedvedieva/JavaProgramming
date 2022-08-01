package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String grade = grade(76);

        String result = (grade.equals("A"))? "Excellent" :(grade.equals("B"))? "Great" :(grade.equals("C"))? "Good"
                :(grade.equals("D"))? "Pass" :"fail";
        System.out.println(result);

    }

    public static String grade (int score){
        String result = "";
        if (score <0 || score >100){
            result = "invalid";
        }else{
            result = (score >=90)? "A" :(score >=80)? "B" :(score >=70)? "C" :(score >=60)? "D" : "F";
        }
        return result;
    }
}
