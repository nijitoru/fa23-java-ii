
public class LoopReview {

	public static void main(String[] args) {
		
	/*	// for loop
		for(int i = 100; i >= 0; i -= 10) {
			System.out.println(i);
		}
		
		// while loop
		int i = 0;
		while (i <= 100) {
			System.out.println(i);
			i += 10;
		} // value still stored in i
		
		while(i >= 0) {
			System.out.println(i);
			i-=10;
		}
		
		// do while loop
		do {
			System.out.println(i);
			i += 10;
		} while (i >= 0);	*/
		
	
	/*	for(int i = 100; i>=0; i--) {
			if(i%5 == 0)
				System.out.println(i);
		}	*/
		
		// either multiple of 3 or 5 not both
		for(int i=50; i>=0; i--) {
			if((i%3 == 0 || i%5 == 0) && !(i%3 == 0 && i%5 == 0)) {
				//System.out.println(i);
				if(i==20)
					//break;
					continue;
				System.out.println(i);
			}
		}
		
	}

}
