package BankLoanSystemProject;

import java.util.Scanner;

/**
 * The LoanProcessorTest class is the main entry point for the Bank Loan System.
 * It allows users to select a loan type and input their loan details.
 */
public class LoanProcessorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display loan options
        String textBlock = """
                Welcome to the Loan Processor System!
                Select Loan Type:
                1. Car Loan
                2. Home Loan
                3. Personal Loan
                Enter your choice (1-3):
                """;
        System.out.print(textBlock);

        int choice = input.nextInt();

        // Collect loan details from the user
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter interest rate (annual in %): ");
        double interestRate = input.nextDouble();

        System.out.print("Enter loan term (years): ");
        int termInYears = input.nextInt();

        // Validate input to prevent negative values
        if (loanAmount < 0 || interestRate < 0 || termInYears <= 0) {
            System.out.println("Error: Loan amount, interest rate, and term must be positive values.");
            return;
        }

        Loan loan = null; // Loan reference variable

        // Select the appropriate loan type
        switch (choice) {
            case 1:
                loan = new CarLoan(loanAmount, interestRate, termInYears);
                break;
            case 2:
                loan = new HomeLoan(loanAmount, interestRate, termInYears);
                break;
            case 3:
                loan = new PersonalLoan(loanAmount, interestRate, termInYears);
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
                return;
        }

        // Display loan details
        loan.showLoanDetails();

        input.close();
    }
}
