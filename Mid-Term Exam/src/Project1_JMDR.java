//Judy Marie Delos Reyes
//16 October 2023
//Compares array's first and third elements to check if they are equal.

import java.util.Scanner;

public class Project1_JMDR {

	public static void main(String[] args) {
		String[] str_JMDR = new String[7];
		int length_JMDR = str_JMDR.length;
		String thirdE_JMDR = str_JMDR[2], lastE_JMDR = str_JMDR[length_JMDR-1];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < str_JMDR.length; i++) {
			System.out.print("Input (" + (i+1) + " out of 7) times: ");
			str_JMDR[i]= input.next();
		}
		
		System.out.println();
		
		//prints all elements in array
		displayArray(str_JMDR);
		//prints only first three letters of each string
		firstThree(str_JMDR);
		//compare third and last elements to check if they are equal
		thirdE_JMDR.equalsIgnoreCase(lastE_JMDR);
	}


	private static void firstThree(String[] str) {
		String[] firstThreeLetter_JMDR = new String[str.length];
		for (int k = 0; k < str.length; k++) {
			if(str[k].length() > 3) {
				System.out.println(str[k].substring(0, 3));
			} else {
				System.out.println(str[k]);
			}
			
		}
		System.out.println();
	}

	private static void displayArray(String[] str) {
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
		}
		System.out.println();
	}

}
