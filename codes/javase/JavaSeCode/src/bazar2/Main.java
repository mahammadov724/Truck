package bazar2;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
	    System.out.println("Dairənin sahəsi: " + circle.calculateArea());
	    System.out.println("Dairənin çevrəsi: " + circle.calculatePerimeter());
		CircleModifier circlemodifier = new CircleModifier();
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println("duzbucaqlinin saheni hesabla: " + rectangle.calculateArea());
	    System.out.println("duzbucaqlinin perimetri hesabla: " + rectangle.calculatePerimeter());
	}

}
