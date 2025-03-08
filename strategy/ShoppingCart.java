package strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method first");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
