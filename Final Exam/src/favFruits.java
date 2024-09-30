//Judy Marie Delos Reyes
//11-29-2023
//Take user input of fruits(case insensitive), and return input as sentence case.
import java.util.Scanner;
public class favFruits {
	public static void  main(String[] args) {
		String[] favFruits_DR = new String[5];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < favFruits_DR.length; i++) {
			System.out.print("Enter name of fruit #" + (i+1) + " >> ");
			favFruits_DR[i] = input.nextLine();
		}
		String[] senCase_DR = convertSenCase(favFruits_DR);
		System.out.println("\nFruits in sentence case: ");
		for(String fruit : senCase_DR) {
			System.out.println(fruit);
		}
	}

	private static String[] convertSenCase(String[] fruits) {
		String[] senCase_DR = new String[fruits.length];
		for(int i = 0; i < fruits.length; i++) {
			String fruit = fruits[i];
			// checks if name is empty
			if(!fruit.trim().isEmpty()) { // first char to upper, rest into lower
				senCase_DR[i] = fruit.substring(0, 1).toUpperCase() + fruit.substring(1).toLowerCase(); 
			} else { // keep empty in result array
				senCase_DR[i] = fruit; 
			}
		}
		return senCase_DR;
	}
}
