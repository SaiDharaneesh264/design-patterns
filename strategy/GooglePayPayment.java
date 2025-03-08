package strategy;

public class GooglePayPayment implements PaymentStrategy {
    private final String phoneNumber;

    GooglePayPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Google Pay: " + phoneNumber);
    }
}
