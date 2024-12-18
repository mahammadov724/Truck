package ders16;

public class IllegalArgumentException {
	public static void main(String[] args) {
        try {
            int number = -1;
            if (number < 0) {
                throw new IllegalArgumentException("rəqəm mənfi ola bilməz");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
