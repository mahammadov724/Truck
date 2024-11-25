package ders10;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product("Doritos: 2 ədəd",9.0);
		product.calculateDiscount();
		
		Electronic electronic = new Electronic("Elektrikli Süpürgə: Philips",320.0);
		electronic.calculateDiscount();
		
		Clothing clothing = new Clothing("Shirt: L-Size", 35.0);
		clothing.calculateDiscount();
		
		System.out.println("Bizi Seçdiyinizə Görə Təşəkkür Edirik :)");
	}

}
