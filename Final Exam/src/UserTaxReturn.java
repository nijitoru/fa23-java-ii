//Judy Marie Delos Reyes
//11-29-2023
//Calcultes tax amt based on annual income, and displays tax return details.
import java.util.Scanner;
public class UserTaxReturn {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Social Security Number: ");
        String ssn = scanner.nextLine();
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        double annualIncome;
        do {
            System.out.print("Enter your Annual Income: $");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid numeric value for Annual Income.");
                scanner.next(); // consume the invalid input
            }
            annualIncome = scanner.nextDouble();
            if (annualIncome < 0) {
                System.out.println("Income cannot be negative. Please enter a valid Annual Income.");
            }
        } while (annualIncome < 0);

        UserTaxReturn userTax = new UserTaxReturn();
        UserTaxReturn.calculateTaxAmount(annualIncome);

        System.out.println("\nTaxpayer's Tax Return Details:");
        System.out.println(userTax.toString());

        scanner.close();
    }

	private static void calculateTaxAmount(double annualIncome) {
		// TODO Auto-generated method stub
		
	}
}
