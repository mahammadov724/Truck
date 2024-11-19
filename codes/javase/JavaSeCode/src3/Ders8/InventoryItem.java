package Ders8;

public class InventoryItem {
	private int quantity;
	private String name;
	private double price;
	
	public void setQuantity(int quantity) {
		if (this.quantity < 0) {
			this.quantity = 0;
		}
		else {
			this.quantity = quantity;
		}
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
		if (this.price < 0) {
			System.out.println("Qiymet Menfi Eded Ola Bilmeeeez!!");
		}
	}
	public double getPrice() {
		return price;
	}
}
