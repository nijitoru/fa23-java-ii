import java.util.Scanner;

public class TestApartment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Apartment aptm[] = new Apartment[5];
		aptm[0] = new Apartment(307, 2, 2, 600);
		aptm[1] = new Apartment(104, 4, 2, 1200);
		aptm[2] = new Apartment(404, 2, 3, 250);
		aptm[3] = new Apartment(241, 3, 2, 1500);
		aptm[4] = new Apartment(376, 4, 1, 1800);
		
		int bed, bath;
		double rent;
		int count = 0;
		
		System.out.println("Enter minimum number of bedrooms >> ");
		bed = input.nextInt();
		System.out.println("Enter minimum number of bathrooms >> ");
		bath = input.nextInt();
		System.out.println("Enter maximum rent willing to pay >> ");
		rent = input.nextDouble();
		
		System.out.println("");
		
		
		for(int i = 0; i < aptm.length; i++) {
			if(checkApt(aptm[i],bed,bath,rent)) {
			count+=1;
			display(aptm[i]);
			}
		}
		
		if(count==0) {
			System.out.println("There are no apartments that met your criteria.");
		} else {
			System.out.println("\nThere are " + count + " apartment(s) that meet your criteria.");
		}
		
	}
	
	public static boolean checkApt(Apartment apt, int bed, int bath, double rent) {
		boolean checkAptm = false;
		if(apt.getBedNum() >= bed && apt.getBathNum() >= bath && apt.rent <= rent) {
			checkAptm = true;
		}
			
		return checkAptm;
	}
	
	public static void display(Apartment apt) {
		System.out.printf("Apartment #%d: %d bedroom(s) and %d bathrooms. \tRent: $%.2f\n",
				apt.getAptNum(), apt.getBedNum(), apt.getBathNum(), apt.getRent());
	}
	
}
