package abstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Select Bank
        System.out.println("Enter Bank Name (HDFC, ICICI, SBI): ");
        String bankName = sc.nextLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);

        System.out.println("You selected: " + bank.getBankName());

        // Select Loan Type
        System.out.println("Enter Loan Type (Home, Business, Education): ");
        String loanType = sc.nextLine();
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanType);

        // Get Loan Details

        System.out.println("Enter interest rate for " + loanType + " Loan: ");
        double rate = sc.nextDouble();
        loan.setInterestRate(rate);

        System.out.println("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.println("Enter Loan Duration (years): ");
        int years = sc.nextInt();

        loan.calculateLoanPayment(loanAmount, years);
        sc.close();

    }
}
