package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
         String name = "Oleksandra Medvedieva",
                 streetName = "Kolimiyskiy line",
                 city = "Kyiv",
                 state = "Kyivska oblast";
         int buildingNumber = 12,
                 zipCode = 33026;
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);
        // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);



    }
}
