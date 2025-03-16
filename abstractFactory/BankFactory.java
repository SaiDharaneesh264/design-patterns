package abstractFactory;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bankName) {
        if (bankName == null) return null;
        switch(bankName.toLowerCase()) {
            case "hdfc": return new HDFC();
            case "icici": return new ICICI();
            case "sbi": return new SBI();
            default: throw new IllegalArgumentException("Unknown Bank: " + bankName);
        }
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
    
}
