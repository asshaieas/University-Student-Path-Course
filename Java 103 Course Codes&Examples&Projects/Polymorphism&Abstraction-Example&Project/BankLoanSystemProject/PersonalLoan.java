package BankLoanSystemProject;

/**
 * Represents a Personal Loan, which extends the Loan class.
 * This class provides an implementation for calculating the monthly payment
 * for a personal loan based on loan amount, interest rate, and term.
 */
public class PersonalLoan extends Loan {

    /**
     * Constructor to initialize a Personal Loan with the given parameters.
     *
     * @param loanAmount  The total amount borrowed for the personal loan.
     * @param interestRate The annual interest rate (in percentage).
     * @param termInYears The loan term in years.
     */
    public PersonalLoan(double loanAmount, double interestRate, int termInYears) {
        super(loanAmount, interestRate, termInYears);
    }

    /**
     * Calculates the monthly payment for the personal loan using the amortization formula.
     *
     * @return The monthly payment amount.
     */
    @Override
    public double calculateMonthlyPayment() {
        double p = getLoanAmount();  // Principal amount
        double r = getInterestRate() / 12 / 100;  // Convert annual rate to monthly decimal rate
        int n = getTermInYears() * 12;  // Convert loan term from years to months

        // Handle no-interest loan scenario
        if (r == 0) {
            return p / n;
        }

        // Monthly payment calculation using amortization formula
        return (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    /**
     * Displays the details of the personal loan, including loan type, amount, interest rate,
     * term, and monthly payment.
     */
    @Override
    public void showLoanDetails() {
        super.showLoanDetails();
        System.out.printf("Monthly Payment: $%.2f%n", calculateMonthlyPayment());
    }
}
