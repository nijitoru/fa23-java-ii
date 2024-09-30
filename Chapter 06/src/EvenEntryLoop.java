import java.util.*;
// Judy Marie Delos Reyes

public class EvenEntryLoop {
	public static void main(String args[]) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		while(num != 999) {
			if(num % 2 == 0) {
				System.out.println("Good job.");
				break;
			} else if(num % 2 != 0) {
				System.out.println("Error: Not an even number. Please enter another number or '999' to quit.");
				num = input.nextInt();
			} else {
				System.out.println("Error: Please enter another number or '999' to quit.");
			}
		}
		System.out.println("Goodbye.");
	}
}
