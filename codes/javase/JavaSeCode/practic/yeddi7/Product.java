package yeddi7;

public class Product {
	private int quantity;
	private String name;
	private double price;
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		if (price>0) {
			this.price = price-(price * 0.1);
		}
		else {System.out.println("Qiymet menfi eded ola bilmez");}
	}
	public double getPrice() {
		return price;
	}
}
