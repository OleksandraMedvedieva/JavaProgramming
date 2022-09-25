package tests;

public class Array_Frequency {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        int num = 1;
        String res = "";
        String comma = "";


        for (Integer each : nums) {
            int count = 0;
            for (Integer eachEl : nums) {
                if (each==eachEl){
                    count++;
                }
            }


        }

    }
}
