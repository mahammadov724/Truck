package ders12;

public class MobilePayment extends DigitalPayment implements Payment {
	@Override
    public void processPayment(double amount) {
        System.out.println("Mobil cihaz ilə ödəniş " + amount + " AZN ödənildi");
    }

    @Override
    public String getPaymentType() {
        return "Mobil ödənişi";
    }
}
