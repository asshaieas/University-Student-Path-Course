package BankLoanSystemProject;

/**
 * Represents a Car Loan, which is a specific type of Loan.
 * This class extends the Loan class and provides an implementation
 * for calculating the monthly payment based on loan amount, interest rate, and term.
 */
public class CarLoan extends Loan {

    /**
     * Constructor to initialize a Car Loan with the specified loan amount, interest rate, and term.
     *
     * @param loanAmount  The total amount borrowed for the car loan.
     * @param interestRate The annual interest rate (in percentage).
     * @param termInYears The loan term in years.
     */
    public CarLoan(double loanAmount, double interestRate, int termInYears) {
        super(loanAmount, interestRate, termInYears);
    }

    /**
     * Calculates the monthly payment for the car loan using the amortization formula.
     *
     * @return The monthly payment amount.
     */
    @Override
    public double calculateMonthlyPayment() {
        double p = getLoanAmount();  // Principal loan amount
        double r = getInterestRate() / 12 / 100;  // Monthly interest rate (converted from annual percentage)
        int n = getTermInYears() * 12;  // Convert loan term from years to months

        // Handle no-interest loan (zero interest rate)
        if (r == 0) {
            return p / n; // No interest, simple division
        }

        // Monthly payment calculation using standard amortization formula
        return (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    /**
     * Displays the details of the car loan, including loan type, amount, interest rate,
     * term, and monthly payment.
     */
    @Override
    public void showLoanDetails() {
        super.showLoanDetails();
        System.out.printf("Monthly Payment: $%.2f%n", calculateMonthlyPayment());
    }
}
