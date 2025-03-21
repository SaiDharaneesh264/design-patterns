package strategy;

public class PaypalPayment implements PaymentStrategy {
    private final String email;

    PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
    
}
