package ders12;

public class DigitalPayment implements Payment {
	@Override
    public void processPayment(double amount) {
        System.out.println("Rəqəmsal ödəniş " + amount + " AZN ödənildi");
    }

    @Override
    public String getPaymentType() {
        return "Rəqəmsal ödəniş";
    }
    
	public void verifyTransaction() {
        System.out.println("Ödəniş təsdiqlənir...");
    }
}
