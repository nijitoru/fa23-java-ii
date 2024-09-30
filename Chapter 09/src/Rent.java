public class Rent {
	public static void main(String[] args) {
		int[][] rent =
			{
					{400, 450, 510},
					{500, 560, 630},
					{625, 676, 740},
					{1000, 1250, 1600}
			};
//		int rows = rent.length;
//		int cols = rent[0].length;
		double[] minMaxAvg = new double[4];
		minMaxAvg = calMinMaxAvg(rent);
		System.out.println("Min: $" + minMaxAvg[0]);
		System.out.println("Max: $" + minMaxAvg[1]);
		System.out.println("Avg: $" + minMaxAvg[2]);
		System.out.println("Sum: $" + minMaxAvg[3]);
		
//		System.out.println(row);
//		System.out.println("Number of units per floor: " + col);
//		System.out.println(rent[2][1]);
//		System.out.println(rent[3][2]);
//		System.out.println("Floor\tZero Bedrooms\tOne Bedroom\tTwo Bedrooms");
//		display(rent);
//		displayMax(rent); // display floor # and # of rooms + price
//		double averageRent = calculateAvgPrice(rent);
//		System.out.printf("Average rent for this apartment is $" + averageRent); // .%f 
	}
	private static double[] calMinMaxAvg(int[][] rent) {
		double[] mMaxAvg = new double[4];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int rows = rent.length;
		int cols = rent[0].length;
		int sum = 0;
		double average = 0.0;
		for (int row = 0; row < rent.length; row++) {
			for (int col = 0; col < rent[row].length; col++) {
				if(max < rent[row][col]) {
					max = rent[row][col];
				}
				if(min > rent[row][col]) {
					min = rent[row][col];
				}
				sum += rent[row][col];
			}
		}
		average = sum / (rows * cols);
		mMaxAvg[0] = min;
		mMaxAvg[1] = max;
		mMaxAvg[2] = average;
		mMaxAvg[3] = sum;
		return mMaxAvg;
	}
	private static double calculateAvgPrice(int[][] rent) {
		int rows = rent.length;
		int cols = rent[0].length;
		int sum = 0;
		double average = 0.0;
		for (int row = 0; row < rent.length; row++) {
			for (int col = 0; col < rent[row].length; col++) {
				sum += rent[row][col];
			}
		}
		average = sum / (rows * cols);
		return average;
	}
	private static void displayMax(int[][] rent) {
		// return most expensive unit
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int rows = rent.length;
		int cols = rent[0].length;
		String numOfBedrooms = "";
		int floor = 0, unitNum = 0, floorMIN = 0;
		String numOfBedroomsMIN = "";
		for (int row = 0; row < rent.length; row++) {
			for (int col = 0; col < rent[row].length; col++) {
				if(max < rent[row][col]) {
					max = rent[row][col];
					floor = row;
					unitNum = col;
					if(col == 0)
						numOfBedrooms = "Zero bedrooms";
					else if(col == 1)
						numOfBedrooms = "One bedroom";
					else
						numOfBedrooms = "Two bedrooms";
				}
				if(min > rent[row][col]) {
					min = rent[row][col];
					floorMIN = row;
//					unitNum = col;
					if(col == 0)
						numOfBedroomsMIN = "Zero bedrooms";
					else if(col == 1)
						numOfBedroomsMIN = "One bedroom";
					else
						numOfBedroomsMIN = "Two bedrooms";
				}
			}	
		}
		System.out.println("Most expensive apartment found.");
		System.out.println("Floor: " + (floor + 1) + "\t# of Bedroom(s): " + numOfBedrooms + "\tRent: $" + max);
		System.out.println();
		System.out.println("Most cheapest apartment found.");
		System.out.println("Floor: " + (floorMIN  + 1) + "\t# of Bedroom(s): " + numOfBedroomsMIN + "\tRent: $" + min);
	}
	private static void display(int[][] rent) {
		int row = rent.length;
		int col = rent[0].length;
		for (int i = 0; i < rent.length; i++) {
			System.out.println((i+1) + "\t");
			for (int j = 0; j < rent.length; j++) {
				System.out.println(rent[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}