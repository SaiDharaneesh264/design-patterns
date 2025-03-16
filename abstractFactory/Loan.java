package abstractFactory;

public abstract class Loan {
    protected double rate;

    public abstract void setInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
        double EMI;
        int n = years * 12;
        rate = rate / 1200;
        EMI = (loanAmount * rate * Math.pow(1 + rate, n)) / (Math.pow(1 + rate, n) - 1);
        System.out.println("Monthly EMI: " + EMI);
    }
}
