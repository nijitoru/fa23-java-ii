
public class ReturnArray {

	public static void main(String[] args) {
		//sort name
		//return array
		int[] nums = new int[10];
		String[] names = {"Zed", "Mary", "Anna", "Ted", "Jonah"};
		// j is before m
		
		nums = getNums();
		
	 // for(int n : nums)
		for(int n : getNums()) {
			System.out.print(n + "  ");
		}
		
		System.out.println();
		//compareToIgnoreCase
		
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = 0; j < names.length - 1; j++) {
				String tempName = "";
				if(names[j].compareToIgnoreCase(names[j+1]) > 0) {
					tempName = names[j];
					names[j] = names[j+1];
					names[j+1] = tempName;
				}
			}
		}
		
		for(String name : names) {
			System.out.print(name + "  ");
		}
	}

	private static int[] getNums() {
		int[] values = new int[10];
		for(int i = 0; i < values.length; i++) {
			values[i] = i * 5;
		}
		return values;
	}

}
