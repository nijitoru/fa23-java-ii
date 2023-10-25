import java.util.*;
// Judy Marie Delos Reyes

public class QuizScoreStatistics {
	public static void main(String args[]) {
		int quizScore, average;
		int count = 0, sum = 0;
		int min = 0;
		int max = 10;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter quiz score or '99' to exit: ");
			quizScore = input.nextInt();
			
			if(quizScore == 99) {
				break;
			} else {
				sum += quizScore;
				count++;
				
				if(quizScore > max) {
					max = quizScore;
				}
				if(quizScore < min) {
					min = quizScore;
				}
			}
		}
		
		while(true);
		average = sum / count;
		
		System.out.println("");
		System.out.println("Highest score is " + max);
		System.out.println("Lowest score is " + min);
		System.out.println("Average score is " + average);
	}
}
