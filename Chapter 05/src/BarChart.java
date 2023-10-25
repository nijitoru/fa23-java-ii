import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		int points[] = new int[5];
		String[] players = {"Art","Bob","Cal","Dan","Eli"};
		
		for(int i=0; i<5; i++) {
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter points earned by " + players[i] + " >> ");
			points[i] = input.nextInt();
		}
		
		System.out.println("\n");
		
		System.out.println("Points for Game\n");
		displayBarChart(players[0], points[0]);
		displayBarChart(players[1], points[1]);
		displayBarChart(players[2], points[2]);
		displayBarChart(players[3], points[3]);
		displayBarChart(players[4], points[4]);
		
		System.out.println("");
		
		displayBarChart2(players[0], points[0]);
		displayBarChart2(players[1], points[1]);
		displayBarChart2(players[2], points[2]);
		displayBarChart2(players[3], points[3]);
		displayBarChart2(players[4], points[4]);
		
	}

	private static void displayBarChart(String players, int points) {
		System.out.print(players + "\t");
		for(int i = 0; i < points; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	private static void displayBarChart2(String players, int points) {
		System.out.print(players + "\t");
		for(int i = 0; i < points / 10; i++) {
			System.out.print("*");
		}
		if(points / 10 == 0) {
			System.out.print("-");
		}
		System.out.println("");
	}
	
}
