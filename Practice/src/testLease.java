import java.util.Scanner;

public class testLease {
	public static void main(String[] args) {
		lease lease1 = new lease();
		lease lease2Pet = new lease();
		
		getLeaseInfo(lease1);
		getLeaseInfo(lease2Pet);
		
		System.out.println("Display default values");
		//displayLeaseInfo(lease1);
		System.out.println("\nChange default values");
		//displayLeaseInfo(lease1);
		
		System.out.println("\nTenant with Pet");
		displayLeaseInfo(lease2Pet);
		
	}

	private static void getLeaseInfo(lease lease) {
		String name;
		int aptNum;
		double rent;
		int term;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Name ");
		name = keyboard.nextLine();
		aptNum = keyboard.nextInt();
		rent = keyboard.nextDouble();
		term = keyboard.nextInt();
		
		lease.setTenantName(name);
		lease.setAptNumber(aptNum);
		lease.setRentAmt(rent);
		lease.setLeaseTerm(term);
	}

	private static void displayLeaseInfo(lease lease1) {
		System.out.println("\nChanged default values");
		System.out.println("Tenant name: " + lease1.getTenantName());
		System.out.println("Apartment number: " + lease1.getAptNumber());
		System.out.println("Monthly rent: $" + lease1.getRentAmt());
		System.out.println("Lease term: " + lease1.getLeaseTerm());		
	}
	
}
