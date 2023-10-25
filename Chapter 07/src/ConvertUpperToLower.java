
public class ConvertUpperToLower {

	public static void main(String[] args) {
		// 65-90 display uppercase then lowercase
		for(int i=65; i <=90; i++) {
			if((i - 65) % 10 == 0) {
				System.out.println("");
			}
			char aChar = (char) i;
			System.out.print((aChar) + " ");
		}
		
		System.out.println("");
		
		for(int j=65; j <=90; j++) {
			if((j + 65) % 10 == 0) {
				System.out.println("");
			}
			char aChar = (char) j;
			System.out.print(Character.toLowerCase(aChar) + " ");
		}
		
		System.out.println("\n");
		
		int count = 0;
		String msg = "pee pee poo poo";
		int length = msg.length();
		System.out.println(length);
		
		for(int k = 0; k < length; k++) {
			if(Character.isWhitespace(msg.charAt(k))) {
				count++;
				if(msg.charAt(k) == ' ')
					System.out.print("*");
				else
					System.out.print(msg.charAt(k));
			}
		}
		
		System.out.println(" " + count + "\n");
		
		String gcc = "gcc", uog = "uog";
		if(gcc.equals(uog)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
//		if(isEqual(gcc, uog)) {
//			System.out.println("Equal");
//		} else {
//			System.out.println("Not equal");
//		}
		
		int test = testTwoString(gcc, uog);
		System.out.println(test);
		if(test == 0) {
			System.out.println("The two strings are the same.");
		} else if (test < 0) {
			System.out.println(gcc + " is before " + uog + " in alphabetical order.");
		} else {
			System.out.println(gcc + " is after " + uog + " in alphabetical order.");
		}
	}
	
	public static boolean isEqual(String a, String b) {
		return a.equals(b);
	}
	public static int testTwoString(String a, String b) {
		return a.compareTo(b);
	}

}
