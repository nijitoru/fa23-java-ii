
public class lease {
	private String tenantName;
	private int aptNumber;
	private double rentAmt;
	private int leaseTerm;
	
	public lease() {
		tenantName = "XXX";
		aptNumber = 0;
		rentAmt = 1000;
		leaseTerm = 12;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public int getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}

	public double getRentAmt() {
		return rentAmt;
	}

	public void setRentAmt(double rentAmt) {
		this.rentAmt = rentAmt;
	}

	public int getLeaseTerm() {
		return leaseTerm;
	}

	public void setLeaseTerm(int leaseTerm) {
		this.leaseTerm = leaseTerm;
	}
	
	public void addPetFee() {
		double petFee = 10;
		rentAmt += petFee;
		explainPetPolicy();
	}
	
	public void explainPetPolicy() {
		System.out.println("Your pet costs $10 extra on rent.");
	}
}
