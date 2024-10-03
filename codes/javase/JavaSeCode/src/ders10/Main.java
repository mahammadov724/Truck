package ders10;

import ders9.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
        
        double result1 = calculator.average(10,20);
        System.out.println("10 ve 20-nin eded ortasi:" + " " + result1);
        
        double result2 = calculator.average(15,20);
        System.out.println("15 ve 20-nin eded ortasi:" + " " + result2);

	}

}
