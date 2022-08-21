package day43_Abstraction.shapeTask;

public final class Circle extends Shape {
    public static final double pi = 3.14;
    private double r;

    public Circle(double r) {
        super("Circle");
        setR(r);
    }

    public void setR(double r){
        if (r<=0){
            throw new RuntimeException("Invalid radius: " + r);
        }
        this.r = r;
    }
    public double getR(){
        return r;
    }

    @Override
    public double area() {
        return r * r * pi;
    }

    @Override
    public double perimeter() {
        return 2 * r * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + r +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

}

/*
Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi
 */
