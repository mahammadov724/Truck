package ders10;

public class Circle {
    double radius;
    double length;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateLength() {
        this.length = 2 * Math.PI * radius;
    }
}
