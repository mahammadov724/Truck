package ders12;

public class CashPayment implements Payment {
	@Override
    public void processPayment(double amount) {
        System.out.println("Nağd olaraq " + amount + " AZN ödənildi");
    }

    @Override
    public String getPaymentType() {
        return "Nağd ödəniş";
    }
}
