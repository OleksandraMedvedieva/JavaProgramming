package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }
    public Shape(String name) {
        setName(name);
    }
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}

/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}



Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter


Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter


Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter

 */
