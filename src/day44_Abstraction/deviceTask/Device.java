package day44_Abstraction.deviceTask;

public abstract class Device {

    private final String brand, model,size;
    private double price;
    private String color;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        if (brand.isEmpty() || brand == null){
            throw new RuntimeException("Invalid brand");
        }
        this.brand = brand;

        if (model.isEmpty() || model == null){
            throw new RuntimeException("Invalid model");
        }
        this.model = model;

        if (size.isEmpty() || size == null){
            throw new RuntimeException("Invalid size");
        }
        this.size = size;

        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null){
            throw new RuntimeException("Invalid color");
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();


    @Override
    public String toString() {
        return  getClass().getSimpleName() +

                ", model='" + model + '\'' +
                ", price=" + price;
    }
}


/*
Device Task:
	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */
