package yeddi10;

public class Vehicle {
	String brand;
	 int speed;
	 
	 public Vehicle(String brand, int speed) {
	        this.brand = brand;
	        this.speed = speed;
	 }
	 
	 public void showInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed + " km/h");
	 }
}
