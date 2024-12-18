package ders16;

public class ArithmeticException {
	public static void main(String[] args) {
        try {
            int result = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
