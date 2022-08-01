package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {

        double width = 2.5;
        double length = 5;
        double perimeter = 2 * (width + length);
        double area = width * length;
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }


}

/*
2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */
