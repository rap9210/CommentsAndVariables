import java.util.Scanner;

public class CommentsAndVariableNames {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double loan_amount = 0;
        double interest_rate = 0;
        double mortgage_payment = 0;
        double balance = 0;
        int loan_payment_term;
        /*
        Prompt user for loan amount, interest rate, and loan payment term.
         */
        System.out.printf("Enter the loan amount: ");
        loan_amount = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        interest_rate = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        loan_payment_term = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();
        /*
        Based on previous user inputs, use processSomething formula to calculate
        mortgage payments, balance, and print those to console.
         */
        mortgage_payment = processSomething(loan_amount, interest_rate, loan_payment_term);
        balance = -(mortgage_payment*(loan_payment_term*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", mortgage_payment);
    }
        /*
        Created formula for mortgage calculations.
         */

    public static double processSomething(double loan_amount, double interest_rate, int loan_payment_term) {
        // calculates the monthly payment
        double rate = (interest_rate/ 100) / 12;
        double base = (1 + rate);
        double months = loan_payment_term* 12;
        double result = 0.0;
        result = ((rate * loan_amount) / (1 - Math.pow(base, -months)));

        return result;
    }
}
