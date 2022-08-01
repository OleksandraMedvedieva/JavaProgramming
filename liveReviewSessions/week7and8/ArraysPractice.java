package week7and8;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] codes= new int [8];
        codes[0] = 200;
        codes[2] = 204;
        codes[codes.length-1] =500;

        for (int i = 0; i < codes.length; i++) {
            System.out.println("codes ["+i+"] = " + codes[i]);
        }

        System.out.println(Arrays.toString(codes));
        System.out.println("---------------------second way of creating array ----------------------------");

        int[] statusCodes = {200,201,204,400,401,403,404,500};
        for (int i = 0; i < statusCodes.length; i++) {
            System.out.println("Status codes = " + statusCodes[i]);
        }
        System.out.println(Arrays.toString(statusCodes));


        String[] responseTypes = new String[] {"Ok", "Created","No Content", new String ("Bad request"),
        "Unauthorized", "Forbidden", "Not Found", "Internal server error"} ;
        System.out.println(Arrays.toString(responseTypes));

        for (int i = 0; i < statusCodes.length; i++) {
            String text = statusCodes[i] + " : " + responseTypes[i];
            System.out.println("Each status codes means =" + text);
        }


    }
}
