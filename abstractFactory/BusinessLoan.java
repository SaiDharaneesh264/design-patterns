package abstractFactory;

public class BusinessLoan extends Loan {

    @Override
    public void setInterestRate(double rate) {
       this.rate = rate;
    }
    
}
