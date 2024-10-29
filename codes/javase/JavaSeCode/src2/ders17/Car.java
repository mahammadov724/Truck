package ders17;

public class Car {
	    String model;
	    int year;
	    int speed;

	    public Car(String model, int year) {
	        this.model = model;
	        this.year = year;
	        this.speed = 0;
	    }

	    public void start() {
	        System.out.println("Avtomobil işə düşdü: " + model);
	    }

	    public void accelerate(int increment) {
	        speed += increment;
	        System.out.println("Sürət artırıldı: " + speed + " km/s");
	    }

	    public void brake(int decrement) {
	        if (speed >= decrement) {
	            speed -= decrement;
	            System.out.println("Sürət azaldıldı: " + speed + " km/s");
	        } else {
	            System.out.println("Sürət bu qədər azaldıla bilməz");
	        }
	    }

	    public void displayInfo() {
	        System.out.println("Model: " + model + ", İl: " + year + ", Sürət: " + speed + " km/s");
	    }
	}

