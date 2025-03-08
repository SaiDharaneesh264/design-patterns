package strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit card: " + cardNumber);    
    }
    
}
