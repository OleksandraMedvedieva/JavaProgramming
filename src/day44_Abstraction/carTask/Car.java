package day44_Abstraction.carTask;

public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, String color, int year, double price) {
        if (make.isEmpty() || make == null){
            throw new RuntimeException("Invalid make");
        }
        this.make = make;
        if (model.isEmpty() || model == null){
            throw new RuntimeException("Invalid model");
        }
        this.model = model;
        setColor(color);
        if (year<1886){
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null){
            throw new RuntimeException("Invalid color");
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public abstract void start();
    public abstract void drive();
    public final void stop(){
        System.out.println(model + " " + make + " is stopping");
    }
}


/*
1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */
