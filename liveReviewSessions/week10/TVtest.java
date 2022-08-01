package week10;

public class TVtest {
    public static void main(String[] args) {

        TV samsung = new TV();
        System.out.println("samsung = " + samsung.volumeLevel);
        samsung.volumeLevel = 6;
        System.out.println("samsung = " + samsung.volumeLevel);
        TV sony = new TV();
        System.out.println("sony = " + sony.volumeLevel);
        System.out.println("samsung = " + samsung.on);
        samsung.turnOn();
        System.out.println("samsung = " + samsung.on);


    }
}
