package yeddi7;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName ("snickers");
		product.setQuantity (2354);
		product.setPrice (100);
		System.out.println("Name:" + product.getName());
		System.out.println("Id:" + product.getQuantity());
		System.out.println("Price:" + product.getPrice());
	}

}
