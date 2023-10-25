import java.util.*;
// Judy Marie Delos Reyes

public class CreatePurchase {

	public static void main(String[] args) {
		int invoiceNumber;
        double saleAmount;
        boolean hasError = false;
		
		Purchase purchase1 = new Purchase();
		Scanner scanner = new Scanner(System.in);
        
		 do {
			 if(hasError) {
				 System.out.println("Invalid entry. Try again.");
			 }
	            System.out.print("Enter invoice number: ");
	            invoiceNumber = scanner.nextInt();
	            hasError = true;
		 } 
		 
		 while(invoiceNumber < 1000 || invoiceNumber > 8000);

		 hasError = false;
		 do {
			 saleAmount = 0.0;
			 if(hasError) {
				 System.out.println("Please enter a valid number >= to 0.");
			 }
			 System.out.print("Enter sale amount: $");
			 while(!scanner.hasNextDouble()) {
				 scanner.next();
				 System.out.println("Invalid number. Please try again.");
			 }
			 saleAmount = scanner.nextDouble();
			 hasError = true;
		 } 
		 
		 while(saleAmount <= 0.0);
		 purchase1.setSaleAmount(saleAmount);
		 
		 System.out.println();
		 System.out.println("Invoice #" + invoiceNumber);
		 purchase1.display();
	}

}
