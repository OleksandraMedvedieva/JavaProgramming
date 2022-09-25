package week18.interfaceDemo;

public class SuperManTest {
    public static void main(String[] args) {

        Father superManOne = new Father();
        superManOne.playKid();
        superManOne.work("SDET");
        superManOne.feedKid();
        superManOne.raiseKid();
        System.out.println("Makes " + superManOne.getPaid() + " Dollars");

        Parent superManTwo = new Father();
        superManTwo.feedKid();
        superManTwo.playKid();
        superManTwo.raiseKid();
        ((Father)superManTwo).work("QA Engineer");
        Worker superManThree = new Father();
        superManThree.getPaid();
        superManThree.work("QA");
        ((Father)superManThree).playKid();

        superManTwo = new Mother();
        superManTwo.raiseKid();
        superManTwo.playKid();

        Parent father = new SuperFather();
        father.playKid();




    }
}
