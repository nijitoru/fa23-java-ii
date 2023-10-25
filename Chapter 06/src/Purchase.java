import java.text.DecimalFormat;

// Judy Marie Delos Reyes

public class Purchase {
	private int invoiceNumber;
	private double saleAmount;
	private double tax;

	private static final double RATE = 0.05;
	
	public void setSaleAmount(double amt) {
		this.tax = amt * RATE;
		this.saleAmount = amt;
	}
	
	public double getSaleAmount() {
		return this.saleAmount;
	}
	
	public int getInvoiceNumber() {
		return this.invoiceNumber;
	}
	
	public void display() {
		DecimalFormat df = new DecimalFormat("####0.00");
		System.out.println("Amount of sale: $" + df.format(saleAmount) + "\nTax: $" + df.format(tax));
	}
}
