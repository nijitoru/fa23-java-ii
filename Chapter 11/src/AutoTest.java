
public class AutoTest {

	public static void main(String[] args) {
		//array of automobile class (3)
		Automobile[] carArray = new Automobile[3];
		double avgMiles = 0;
		
		carArray[0] = new Automobile(-50, 2005, 20, "Honda", "Civic", "Grey");
		carArray[1] = new Automobile(1000, 2008, 40, "Hyundai", "Elantra", "Grey");
		carArray[2] = new Automobile(1001, 2006, 100, "Toyota", "Camry", "Pink");
		
		if(carArray[0].equals(carArray[1])) {
			System.out.println("The two cars are equal");
		} else {
			System.out.println("The two cars are not equal");
		}

		displayCarDetails(carArray);
		avgMiles = calAvgMiles(carArray);
		//find oldest car and display its details
		displayOldestCar(carArray);
		System.out.println("Average miles of the three cars are " + avgMiles);
	}

	private static void displayOldestCar(Automobile[] car) {
		int oldest = Integer.MIN_VALUE;
		String oldCar = "";
		
		for (int i = 0; i < car.length; i++) {
			if(car[i].getYear() < oldest) {
				oldest = car[i].getYear();
				oldCar = car[i].toString();
			}
		}
		System.out.println("Oldest car is made in " + oldest);
		System.out.println(oldCar);
	}

	private static double calAvgMiles(Automobile[] car) {
		int sum = 0;
		double avg = 0;
		
		//use for loop
		for (int i = 0; i < car.length; i++) {
			sum += car[i].getMiles();
		}
		avg = sum / 3.0;
		return avg;
	}

	private static void displayCarDetails(Automobile[] car) {
		for (int i = 0; i < car.length; i++) {
			System.out.println("Car " + (i+1) + " " + car[i].toString());
			System.out.println();
		}
		
	}

}
