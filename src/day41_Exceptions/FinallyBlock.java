package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int [] arr= {1,2,3};


        try{
            System.out.println(arr[10]);
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally{
            System.out.println("Finally Block");
        }





    }
}
