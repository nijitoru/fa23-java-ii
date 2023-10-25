import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// write method that returns boolean value
		if(isEven()) 
			System.out.println("The number is an even number.");
		else
			System.out.println("The number is an odd number");

	}

	private static boolean isEven() {
		int number;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = keyboard.nextInt();
		
		boolean isEven = false;
		
		if(number % 2 == 0)
			isEven = true;
		
		return false;
	}
	
}
