//Judy Marie Delos Reyes
//11-29-2023
//TaxReturn class provided.
public abstract class TaxReturn {
	protected String socialScurityNumber;
	protected String name;
	protected double annualIncome;
	protected double taxAmount;
	public TaxReturn(String ssn, String n) {
		socialScurityNumber = ssn;
		name = n;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public abstract void calculateTaxAmount(double annualIncome);
}
