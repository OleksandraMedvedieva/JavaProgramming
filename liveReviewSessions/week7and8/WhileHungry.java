package week7and8;

public class WhileHungry {
    public static void main(String[] args) {
        int bananas = 0;
        int countToFull= 3;

        while (true){
            if(bananas==countToFull){
                break;
            }
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C " + bananas); // unicode of 🍌
        }





    }
}
