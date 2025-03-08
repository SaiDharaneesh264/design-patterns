package strategy;

public class BankTransferPayment implements PaymentStrategy {
    private final String accountNumber;

    BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Bank Transfer: " + accountNumber);
    }
    
}
