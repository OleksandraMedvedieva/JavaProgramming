package day43_Abstraction.shapeTask;

public final class Square extends Shape {
    private double s;

    public Square(double s) {
        super("Square");
        setS(s);
    }

    public double getS(){
        return s;
    }
    public void setS(double s){
        if (s<=0){
            throw new RuntimeException("Invalid side: " + s);
        }
        this.s = s;
    }

    @Override
    public double area() {
        return s * s;
    }

    @Override
    public double perimeter() {
        return 4 * s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
/*
Square:
					area(): s * s
					perimeter: 4 * s

 */
