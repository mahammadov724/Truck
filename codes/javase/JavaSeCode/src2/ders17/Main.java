package ders17;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car("BMW", 2020);
        myCar.start();
        myCar.accelerate(330);
        myCar.brake(30);
        myCar.displayInfo();
        myCar.brake(40);
	}

}
