package abstractFactory;

public class HomeLoan extends Loan {
    @Override
    public void setInterestRate(double rate) {
       this.rate = rate;
    } 
}
