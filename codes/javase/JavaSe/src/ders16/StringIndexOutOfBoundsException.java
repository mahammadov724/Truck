package ders16;

public class StringIndexOutOfBoundsException {
	public static void main(String[] args) {
        try {
            String str = "Hello World";
            System.out.println(str.charAt(30));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
