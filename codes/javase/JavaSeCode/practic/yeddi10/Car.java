package yeddi10;

public class Car extends Vehicle {
	 int doors;
	 public Car(String brand, int speed, int doors) {
	        super(brand, speed);
	        this.doors = doors;
	 }
	 
	 public void showInfo() {
	        super.showInfo();
	        System.out.println("Doors: " + doors);
	 }
}
