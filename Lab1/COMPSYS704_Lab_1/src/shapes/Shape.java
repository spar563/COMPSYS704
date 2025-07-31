package shapes;

public abstract class Shape {
	// TODO: Implement as per the UML
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for area calculation
    public abstract double calculateArea();
}
