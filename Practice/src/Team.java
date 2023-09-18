

public class Team {

	public final static String MOTTO = "Sportsmanship!";
	private String schoolName;
	private String sportName;
	private String teamName;
		
	public Team(String school, String sport, String team) {
		schoolName = school;
		sportName = sport;
		teamName = team;
	}
		
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
		
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
		
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
		
	public String getSchoolName() {
		return schoolName;
	}
		
	public String getSportName() {
		return sportName;
	}
		
	public String getTeamName() {
		return teamName;
	}
	
	public String toString() {
		return "School name: " + schoolName +
				"\nSport name: " + sportName +
				"\nTeam name: " + teamName;
	}
}

