package ders16;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
