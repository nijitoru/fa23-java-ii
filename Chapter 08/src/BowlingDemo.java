import java.util.Scanner;

public class BowlingDemo {

	public static void main(String[] args) {
		String teamName, memberName;
		BowlingTeam team = new BowlingTeam();
		BowlingTeam[] teamArray = new BowlingTeam[2];
		
		final int MEMBER = 4;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < teamArray.length; i++) {
			teamArray[i] = new BowlingTeam();
			System.out.println("Enter team " + (i+1) + " name: ");
			teamName = input.next();
			teamArray[i].setTeamName(teamName);
			
			for (int j = 0; j < 4; j++) {
				System.out.println("Enter team member " + (j+1) + " name: ");
				memberName = input.next();
				teamArray[i].setMember(j, memberName);
			}
		}
		
		for (int i = 0; i < teamArray.length; i++) {
			System.out.println("Team " + (i+1) + ": " + teamArray[i].getTeamName());
			for (int j = 0; j < MEMBER; j++) {
				System.out.println(teamArray[i].getMember(j) + "  ");
			}
			System.out.println();
		}
		
//		for (int i = 0; i < MEMBER; i++) {
//			System.out.println("Team member name for " + (i + 1) + ": ");
//			name1 = input.next();
//			team.setMember(i, name1);
//		}
//		
//		for (int i = 0; i < MEMBER; i++) {
//			System.out.println(team.getMember(i));
//		}
	}

}
