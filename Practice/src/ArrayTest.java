
public class ArrayTest {

	public static void main(String[] args) {
		// create array of 10 int data type
		int[] nums = {100, 25, 45, 63, 52, 14, 63, 78, 89, 63};
		String[] names = {"Ann", "John", "Steve", "Sandy", "Ed", "J"};
//		int length = nums.length;
//		int firstE = nums[0], lastE = nums[length - 1], sum = 0;
//		
//		// display array length
//		System.out.println("Array length: " + length);
//		
//		int min = nums[0], max = nums[0];
//		// first element, last element
//		System.out.println("First element: " + firstE + "\nLast element: " + lastE);
//		
//		for(int i = 0; i < nums.length; i++) {
//			//sum += nums[i];
//			
//		}
//		System.out.println(sum);
//		System.out.println((double)(sum)/length);
//		// while, do while
		
		getFirstChar(names);
	}

	public static void getFirstChar(String[] first) {
		char[] lastL = new char[first.length];
		
		// display first letter of each name
		for(int i = 0; i < first.length; i++) {
			System.out.print(first[i].charAt(0) + "\t");
		}
		
		System.out.println("");
		
		// display first four letters, if name is < 4, display name
		for(int i = 0; i < first.length; i++) {
			if(first[i].length() >= 4) {
				System.out.print(first[i].substring(0, 4) + "\t");
			} else {
				System.out.print(first[i] + "\t");
			}
			
		}
		
		System.out.println("");
		
		// create array of char data type, get last char of each name then assign 
			// to char array, then display last char stored in array of char type
		for(int i = 0; i < first.length; i++) {
			lastL[i] = first[i].charAt(first[i].length() - 1);
		}
		int j = 0;
		while(j < lastL.length) {
			System.out.print(lastL[j] + "\t");
			j++;
		}
		
	}
}
