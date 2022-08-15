package day42_Exceptions;

class FadyException extends RuntimeException{
    public FadyException(String message) {
        super(message);
    }
    public FadyException() {
        super("Time for break");
    }

}
class NoBreak extends Exception{

}



public class CustomException {
    public static void main(String[] args) {


        //throw new FadyException();

        try {
            throw new NoBreak();
        } catch (NoBreak e) {
            e.printStackTrace();
        }

    }
}
