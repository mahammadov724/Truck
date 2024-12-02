package ders12;

public class CardPayment extends DigitalPayment implements Payment {
	 @Override
	 public void processPayment(double amount) {
	     System.out.println("Kart ilə ödəniş " + amount + " AZN ödənildi");
	 }

	 @Override
	 public String getPaymentType() {
	     return "Kart ödənişi";
	 }
}
