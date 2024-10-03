package ders10;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);

        Calculator calculator = new Calculator();

        calculator.calculateCircleLength(myCircle);

        System.out.println("Circle Length: " + myCircle.length);
    }
}
