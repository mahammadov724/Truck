package ders12;

public class DigitNumbers {

	public static void main(String[] args) {
		long a = 12345;
		long tersEded = 0;
		while (a != 0) {
			long digit = a % 10;
			tersEded = tersEded * 10 + digit;
			a /= 10;
		}
		System.out.println(tersEded);
	}

}
