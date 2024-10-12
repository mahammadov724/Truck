package bazar2;

public class Circle {
	double radius;
	public Circle(double _radius) {
		this.radius = _radius;
	}
	public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
