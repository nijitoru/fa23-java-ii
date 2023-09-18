
public class TestTeam {

	public static void main(String[] args) {
		Team team1 = new Team("Roosevelt High", "Girls' Basketball", "Dolphins");
		Team team2 = new Team("A High", "Boy's Basketball", "Shark");
		Team team3 = new Team("B High", "Children's Basketball", "Panda");
		
		System.out.println("Team 1:");
		System.out.println(Team.MOTTO);
		System.out.println(team1.toString());
		System.out.println();
		
		System.out.println("Team 2:");
		System.out.println(Team.MOTTO);
		System.out.println(team2.toString());
		System.out.println();
		
		System.out.println("Team 3:");
		System.out.println(Team.MOTTO);
		System.out.println(team3.toString());
		System.out.println();
	}

}
