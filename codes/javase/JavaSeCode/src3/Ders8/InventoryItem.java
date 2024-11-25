package Ders8;

public class InventoryItem {
	private int quantity;
	private String name;
	private double price;
	
	public void setQuantity(int quantity) {
		if (quantity < 0) {
			quantity = 0;
		}
		else {
			quantity = quantity;
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
		if (price < 0) {
			System.out.println("Qiymet Menfi Eded Ola Bilmeeeez!!");
		}
	}
	public double getPrice() {
		return price;
	}
}
