package ders10;

public class Product {
	String name;
	double price;
	
	public Product (String name,double price){
		this.name = name;
		this.price = price;
	}
	
	public double calculateDiscount() {
        double discount = price * 0.10;
        double newPrice = price - discount;
        System.out.println("Product Endirimi 10% çıxıldı:) : " + newPrice);
        return newPrice;
    }
	//A
}
