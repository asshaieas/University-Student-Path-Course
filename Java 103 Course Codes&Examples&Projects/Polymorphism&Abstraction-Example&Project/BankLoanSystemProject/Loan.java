package BankLoanSystemProject;

/**
 * Abstract base class for all loan types.
 * Defines common attributes and an abstract method for calculating monthly payments.
 */
public abstract class Loan {
    private double loanAmount;
    private double interestRate;
    private int termInYears;

    public Loan(double loanAmount, double interestRate, int termInYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.termInYears = termInYears;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateMonthlyPayment();

    // Display loan details
    public void showLoanDetails() {
        System.out.println("Loan Type: " + this.getClass().getSimpleName());
        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Term: " + termInYears + " years");
        System.out.printf("Monthly Payment: $%.2f%n", calculateMonthlyPayment());
    }

    // Getters
    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getTermInYears() { return termInYears; }
}
