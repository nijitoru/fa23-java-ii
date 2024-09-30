
public class BowlingTeam {
	private String teamName;
	private String[] member = new String[4];
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String team) {
		this.teamName = team;
	}
	public String getMember(int number) {
		return member[number];
	}
	public void setMember(int number, String name) {
		this.member[number] = name;
	}
}
