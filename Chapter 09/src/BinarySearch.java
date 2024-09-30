import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		char[] codes = {'B', 'E', 'K', 'M', 'P', 'T'};
		Scanner input = new Scanner(System.in);
		char code;
		System.out.println("Enter a code, I will tell you if it is valid and it's position in the array.");
		code = input.next().charAt(0);
		code = Character.toUpperCase(code);
		System.out.println("code >> " + code);
		findCodeAndPosition(codes, code);
	}
	
	public static void findCodeAndPosition(char[] array, char code){
		//int position = -1;
		int i = 0;
		for (; i < array.length; i++) {
			if(array[i] == code) {
				//position = 1;
				break;
			}
		}
		if(i >= 0)
			System.out.println(code + " is found in position " + i);
		else {
			System.out.println(code + " is invalid.");
		}
	}
}
