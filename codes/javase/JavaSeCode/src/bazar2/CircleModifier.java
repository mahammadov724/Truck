package bazar2;

public class CircleModifier {
	public void modifyCircleRadius(Circle circle, double newRadius) {
        circle.radius = newRadius;
        System.out.println("Yeni radius: " + circle.radius);
    }
}
