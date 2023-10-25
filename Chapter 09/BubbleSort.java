
public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = {40, 30, 1, -1, -10, 5};
		// 30 40 1 -1 -10 5 j=0
		// 30 1 40 -1 -10 5 j=1
		// 30 1 -1 40 -10 5 j=3
		// 30 1 -1 -10 40 5 j=4
		
		sortArray(nums);
	}

	private static void sortArray(int[] nums) {
		int comparison = nums.length - 1;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < comparison - 1; j++) {
				int temp;
				if(nums[j] > nums[j+1]) { // ascending order
					temp = nums[j]; 
					nums[j] = nums[j+1]; 
					nums[j+1] = temp; 
				}
			}
			comparison--;
			displayNewRow(nums);
		}
	}

	private static void displayNewRow(int[] nums) {
		//System.out.println("i = " + i + " | j = " + j);
		for (int number : nums) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
