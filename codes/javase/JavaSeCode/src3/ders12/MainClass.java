package ders12;

public class MainClass {

	public static void main(String[] args) {
		Payment cardPayment = new CardPayment();
        Payment mobilePayment = new MobilePayment();
        Payment cashPayment = new CashPayment();
        Payment digitalPayment = new DigitalPayment();

        cardPayment.processPayment(100.0);
        mobilePayment.processPayment(50.0);
        cashPayment.processPayment(20.0);
        digitalPayment.processPayment(75.0);
        
        System.out.println("Ödəniş növü: " + cardPayment.getPaymentType());
        System.out.println("Ödəniş növü: " + mobilePayment.getPaymentType());
        System.out.println("Ödəniş növü: " + cashPayment.getPaymentType());
        System.out.println("Ödəniş növü: " + digitalPayment.getPaymentType());

	}

}
