//Judy Marie Delos Reyes
//16 October 2023
//Two-dimensional array and show list of cars.

public class Project2_JMDR {

	public static void main(String[] args) {
		int[][] cars_JMDR = {
				{10, 7, 12, 10, 4},
				{18, 20, 27, 12, 18},
				{30, 13, 56, 50, 21},
				{25, 100, 77, 41, 32},
		};
		
		//outputs total # of cars from each make
		totalCarMakes(cars_JMDR);
		//for loop to get total # of Ford cars
		totalFord();
		
		//compare GM Blue with Nissan White
		
		//for loop to get total # of white & grey cars
	}

	private static void totalFord(int[][] cars) {
		int ford_JMDR = 0;
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; i < cars.length; i++) {
				for (int j = 0; j < cars[i].length; j++) {
					ford_JMDR += cars[1][j];
				}
			}
		}
		
	}

	private static void totalCarMakes(int[][] cars) {
		int sum_JMDR = 0;
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				sum_JMDR += cars[i][j];
			}
		}
		System.out.println(sum_JMDR);
	}

}
