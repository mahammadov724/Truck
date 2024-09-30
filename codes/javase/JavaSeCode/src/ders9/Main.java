package ders9;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        double result1 = calculator.average(10, 20);
        System.out.println("10 və 20-nin ədədi ortası: " + result1);
        
        double result2 = calculator.average(5, 15);
        System.out.println("5 və 15-in ədədi ortası: " + result2);
    }
}
