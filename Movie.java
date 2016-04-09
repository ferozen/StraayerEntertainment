
package Entertainment;

public class Movie extends Entertainment implements Broadcast {
	
	private String director;
	private String studio;
	
	// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
	
	
	public Movie(String name, double annualIncome) {
		this.setName(name);
		this.setAnnualIncome(annualIncome);
		
	}

	public String getDirector() {
		return director;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void addBroadcast(String time, String station) {
		
		
	}

	
	public String[] getListOfBroadcasts() {
		
		return null;
	}

	
	
	
	
	
}
