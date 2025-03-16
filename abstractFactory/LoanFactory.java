package abstractFactory;

public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
       if (loanType == null) return null;
       switch (loanType.toLowerCase()) {
        case "home": return new HomeLoan();
        case "business": return new BusinessLoan();
        case "education": return new EducationLoan();
        default: throw new IllegalArgumentException("Unknown Loan Type: " + loanType);
       }
    }
    
}
