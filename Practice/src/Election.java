import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		String[] lastName = new String[5];
		int[] votes = new int[5];
		double[] votePercent = new double[5];
		int maxVotes = votes[0], totalVotes = 0;
		String winner = "";
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < lastName.length; i++) {
			System.out.print("Enter the last name of the candidate " + (i + 1) + ": ");
			lastName[i] = input.next();
			System.out.print("Enter the number of votes for the candidate " + (i+1) + ": ");
			votes[i] = input.nextInt();
			totalVotes += votes[i];
			
			if(votes[i] > maxVotes) {
				maxVotes = votes[i];
				winner = lastName[i];
			}
		}
		sortVotesAcending(votes);
		
		System.out.println();
//		for(String name : lastName) {
//			//System.out.println(name + "\t");
//		}
		
		for(int i = 0; i < votes.length; i++) {
			votePercent[i] = (double)(votes[i]) / totalVotes * 100;
			//System.out.println(votePercent[i] + "\t");
		}
		
		displayElection(lastName, votes, votePercent, winner, totalVotes);
	}

	private static void sortVotesAcending(int[] votes) {
		for(int i = 0; i < votes.length - 1; i++) {
			
			for(int j = 0; j < votes.length - 1; j++) {
				int temp;
				if(votes[j] > votes[j+1]) {
					temp = votes[j];
					votes[j] = votes[j+1];
					votes[j+1] = temp;
				}
			}
		}
		System.out.println();
		for(int number : votes) {
				System.out.println(number + " ");
			}
	}

	private static void displayElection(String[] lastName, int[] votes, double[] votePercent, String winner, int totalVotes) {
		System.out.println("Candidate \tVotes Received \tTotal % of Votes");
		for(int i = 0; i < lastName.length; i++) {
			System.out.printf("%s\t\t%d\t\t%.2f%%\n",lastName[i], votes[i], votePercent[i]);
		}
		System.out.println("Total\t\t" + totalVotes);
		System.out.println("\nWinner: " + winner);
	}

}
