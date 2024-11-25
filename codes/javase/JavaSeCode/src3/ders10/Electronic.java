package ders10;

public class Electronic extends Product{
	
	public Electronic(String name, double price) {
        super(name, price);
    }
	
	@Override
    public double calculateDiscount() {
        double discount = price * 0.20;
        double newPrice = price - discount;
        System.out.println("Electronik Endirimi 20% çıxıldı:) : " + newPrice);
        return newPrice;
    }
	//A
}
