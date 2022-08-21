package day43_Abstraction.shapeTask;

public final class Rectangle extends Shape{
    private double w,l;

    public Rectangle(double w, double l) {
        super("Rectangle");
        setW(w);
        setL(l);
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        if (w<=0){
            throw new RuntimeException("Invalid width: " + w);
        }
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if (l<=0){
            throw new RuntimeException("Invalid length: " + l);
        }
        this.l = l;
    }

    @Override
    public double area() {
        return w * l;
    }

    @Override
    public double perimeter() {
        return 2 * (w+l);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + w +
                ", length=" + l +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)
 */
