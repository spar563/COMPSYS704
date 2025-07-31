package shapes;

public class Square extends Shape {
	// TODO: Implement as per the UML
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
