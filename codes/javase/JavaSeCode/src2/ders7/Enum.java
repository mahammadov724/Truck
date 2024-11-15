package ders7;

import java.util.Scanner;

enum Yay {
	Iyun,
	Iyul,
	Avqust,
}
public class Enum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yayın İçindəki Ayları Yaz!");
		String ay = scan.nextLine().toLowerCase();
		switch (ay) {
		case "iyul": {
			System.out.println("Düzdür");
			break;
		}
		case "iyun": {
			System.out.println("Düzdür");
			break;
		}
		case "avqust": {
			System.out.println("Düzdür");
			break;
		}
		default:
			System.out.println("Səhvdir!");
		}
		 scan.close();
	}

}
