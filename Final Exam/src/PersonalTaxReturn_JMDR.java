//Judy Marie Delos Reyes
//11-29-2023
//Calcultes tax amt based on annual income, and displays tax return details.
import java.util.Scanner;
public class PersonalTaxReturn_JMDR extends TaxReturn {
    public PersonalTaxReturn_JMDR(String ssn, String name) {
        super(ssn, name);
    }
    @Override
    public void calculateTaxAmount(double annualIncome) {
        // tax rates
        double taxRate1 = 0.15;
        double taxRate2 = 0.22;
        double taxRate3 = 0.30;
        if (annualIncome <= 20000) {
            taxAmount = annualIncome * taxRate1;
        } else if (annualIncome <= 50000) {
            taxAmount = 20000 * taxRate1 + (annualIncome - 20000) * taxRate2;
        } else {
            taxAmount = 20000 * taxRate1 + 30000 * taxRate2 + (annualIncome - 50000) * taxRate3;
        }
    }
    @Override
    public String toString() {
        return String.format("Tax Return Details:\nSSN: %s\nName: %s\nAnnual Income: $%.2f\nTax Rate: %.2f%%\nTax Amount: $%.2f",
                socialScurityNumber, name, annualIncome, getTaxRate() * 100, taxAmount);
    }
    public double getTaxRate() {
        if (annualIncome <= 20000) {
            return 0.15;
        } else if (annualIncome <= 50000) {
            return 0.22;
        } else {
            return 0.30;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // user input for income with greater than or equal to 0
        double income;
        do {
            System.out.print("Enter your annual income: $");
            income = scanner.nextDouble();
            System.out.println();
            if (income < 0) {
                System.out.println("Income must be 0 or greater. Please enter a valid amount.");
            }
        } while (income < 0);
        // create object
        PersonalTaxReturn_JMDR taxReturn = new PersonalTaxReturn_JMDR("123-45-6789", "John Doe");
        taxReturn.calculateTaxAmount(income);
        // tax return details
        System.out.println(taxReturn.toString());
    }
}