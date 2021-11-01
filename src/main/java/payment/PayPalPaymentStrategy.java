package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Payment with Paypal is chosen");
    }
}
