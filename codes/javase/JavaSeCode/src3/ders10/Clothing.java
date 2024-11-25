package ders10;

public class Clothing extends Product{
	
	public Clothing(String name, double price) {
        super(name, price);
    }
	
	@Override
    public double calculateDiscount() {
        double discount = price * 0.15;
        double newPrice = price - discount;
        System.out.println("Paltar Endirimi 15% çıxıldı:) : " + newPrice);
        return newPrice;
	}
}
