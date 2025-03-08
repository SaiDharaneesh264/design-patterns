package strategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(1000);

        cart.setPaymentStrategy(new PaypalPayment("abc@gmail.com"));
        cart.checkout(3000);

        cart.setPaymentStrategy(new GooglePayPayment("2234232232"));
        cart.checkout(2500);

        cart.setPaymentStrategy(new BankTransferPayment("AC12342342"));
        cart.checkout(3500);
    }
}
